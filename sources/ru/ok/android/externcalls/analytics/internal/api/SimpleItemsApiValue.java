package ru.ok.android.externcalls.analytics.internal.api;

import java.io.IOException;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.event.EventSerializer;

public class SimpleItemsApiValue extends sr0 {
    private final Iterable<CallAnalyticsEvent> items;

    public SimpleItemsApiValue(Iterable<CallAnalyticsEvent> iterable) {
        this.items = iterable;
    }

    public void write(kb7 kb7) throws IOException, JsonSerializeException {
        kb7.u();
        for (CallAnalyticsEvent serialize : this.items) {
            EventSerializer.INSTANCE.serialize(kb7, serialize);
        }
        kb7.t();
    }
}
