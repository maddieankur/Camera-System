package models;

import java.util.Comparator;

public class TaskPriorityComparator implements Comparator<CaptureRequest> {
    @Override
    public int compare(CaptureRequest t1, CaptureRequest t2) {
        // Custom comparison logic (e.g., descending order by priority)
        return Integer.compare(t1.urgencyLevel.order, t2.urgencyLevel.order);
    }
}
