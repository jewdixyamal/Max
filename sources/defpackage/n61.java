package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* renamed from: n61  reason: default package */
public final class n61 implements m61 {
    public static final List e = Collections.singletonList("rtt");
    public final CallAnalyticsSender a;
    public final vte b;
    public EventItemsMap c;
    public final ArrayList d = new ArrayList();

    public n61(CallAnalyticsSender callAnalyticsSender, wte wte) {
        this.a = callAnalyticsSender;
        this.b = wte;
    }

    public final void b(zag zag, EventItemsMap eventItemsMap) {
        long j;
        EventItemsMap eventItemsMap2 = zag.c;
        eventItemsMap2.addAll(eventItemsMap);
        Long l = zag.d;
        if (l == null) {
            vte vte = this.b;
            Long a2 = ((wte) vte).a();
            if (a2 != null) {
                l = a2;
            } else {
                ((wte) vte).getClass();
                j = System.currentTimeMillis();
                this.a.send(new SdkMetricStatEvent.Builder(zag.a, zag.b).addAll((Map<String, ? extends EventItemValue>) eventItemsMap2.getItems()).set("timestamp", Long.valueOf(j)).build());
            }
        }
        j = l.longValue();
        this.a.send(new SdkMetricStatEvent.Builder(zag.a, zag.b).addAll((Map<String, ? extends EventItemValue>) eventItemsMap2.getItems()).set("timestamp", Long.valueOf(j)).build());
    }

    public final void c(String str, EventItemValue eventItemValue, EventItemsMap eventItemsMap) {
        zag zag = new zag(str, eventItemValue, eventItemsMap, ((wte) this.b).a());
        EventItemsMap eventItemsMap2 = this.c;
        if (eventItemsMap2 == null) {
            this.d.add(zag);
        } else {
            b(zag, eventItemsMap2);
        }
    }
}
