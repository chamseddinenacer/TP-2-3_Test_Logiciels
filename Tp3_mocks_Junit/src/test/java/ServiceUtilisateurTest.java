import org.example.Model.Utilisateur;
import org.example.Repository.UtilisateurRepository;
import org.example.service.ServiceUtilisateur;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static junit.framework.TestCase.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


public class ServiceUtilisateurTest {
    @Mock
    private UtilisateurRepository userRepositoryMock;

    @InjectMocks
    private ServiceUtilisateur serviceUtilisateur;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void testAjouter() {

        Utilisateur utilisateurAttendu = new Utilisateur("1", "John");

        when(userRepositoryMock.save(any(Utilisateur.class))).thenReturn(utilisateurAttendu)
        ;

        Utilisateur utilisateurCree = serviceUtilisateur.ajouter("John");

        assertNotNull(utilisateurCree);
        assertEquals(utilisateurAttendu.getId(), utilisateurCree.getId());
        assertEquals(utilisateurAttendu.getNom(), utilisateurCree.getNom());

        verify(userRepositoryMock, times(1)).save(any(Utilisateur.class));
    }
}