import org.example.ScheduleService;
import org.junit.jupiter.api.Test;

import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ScheduleServiceTest {

    @Test
    void testDoScheduleForGMT() {
        String defaultTimeZone = TimeZone.getDefault().getID();
        String defaultTimeZoneDisplayName = TimeZone.getDefault().getDisplayName();

        if (!defaultTimeZone.equals("GMT+01:00") && !defaultTimeZoneDisplayName.equals("France")) {
            System.out.println("Attention: Le fuseau horaire n'est ni GMT+01:00 ni France.");
            return;
        }

        ScheduleService scheduleService = new ScheduleService();
        assertTrue(scheduleService.doSchedule());
    }

    @Test
    void testBackupForWindows() {
        String osName = System.getProperty("os.name");

        if (!osName.startsWith("Windows")) {
            System.out.println("Attention: Le système d'exploitation n'est pas Windows.");
            return;
        }

        ScheduleService scheduleService = new ScheduleService();
        assertTrue(scheduleService.backup());
    }
}
