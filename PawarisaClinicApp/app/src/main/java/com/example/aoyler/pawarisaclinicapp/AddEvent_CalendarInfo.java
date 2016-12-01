package com.example.aoyler.pawarisaclinicapp;

import com.google.api.client.util.Objects;


import com.google.api.client.util.Objects;


import com.google.api.client.util.Objects;
import com.google.api.services.calendar.model.Calendar;
import com.google.api.services.calendar.model.CalendarListEntry;


public class AddEvent_CalendarInfo implements Comparable<AddEvent_CalendarInfo>, Cloneable {

    String id;
    String summary;


    @Override
    public String toString() {
        return Objects.toStringHelper(AddEvent_CalendarInfo.class).add("id", id).add("summary", summary)
                .toString();
    }

    public int compareTo(AddEvent_CalendarInfo other) {
        return summary.compareTo(other.summary);
    }
}
