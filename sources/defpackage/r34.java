package defpackage;

import ru.ok.tamtam.messages.scheduled.DateTimePicker;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* renamed from: r34  reason: default package */
public final /* synthetic */ class r34 implements wsd {
    public final /* synthetic */ int a;
    public final /* synthetic */ DateTimePicker b;
    public final /* synthetic */ ste c;

    public /* synthetic */ r34(DateTimePicker dateTimePicker, ste ste, int i) {
        this.a = i;
        this.b = dateTimePicker;
        this.c = ste;
    }

    public final void a(int i) {
        switch (this.a) {
            case 0:
                DateTimePicker dateTimePicker = this.b;
                if (!dateTimePicker.O0) {
                    qte qte = (qte) this.c.C(i);
                    u34 u34 = dateTimePicker.M0;
                    if (u34 != null) {
                        ScheduledSendPickerViewModel scheduledSendPickerViewModel = (ScheduledSendPickerViewModel) u34;
                        hm9.m("ScheduledSendPickerViewModel", "hour = " + qte, new Object[0]);
                        q0e q0e = scheduledSendPickerViewModel.e;
                        m34 m34 = (m34) q0e.getValue();
                        if (m34 != null && !tpa.f(m34.b, qte)) {
                            q0e.m((Object) null, m34.a(m34, (x34) null, qte, (qte) null, 5));
                            scheduledSendPickerViewModel.f();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                DateTimePicker dateTimePicker2 = this.b;
                if (!dateTimePicker2.P0) {
                    qte qte2 = (qte) this.c.C(i);
                    u34 u342 = dateTimePicker2.M0;
                    if (u342 != null) {
                        ScheduledSendPickerViewModel scheduledSendPickerViewModel2 = (ScheduledSendPickerViewModel) u342;
                        hm9.m("ScheduledSendPickerViewModel", "minute = " + qte2, new Object[0]);
                        q0e q0e2 = scheduledSendPickerViewModel2.e;
                        m34 m342 = (m34) q0e2.getValue();
                        if (m342 != null && !tpa.f(m342.c, qte2)) {
                            q0e2.m((Object) null, m34.a(m342, (x34) null, (qte) null, qte2, 3));
                            scheduledSendPickerViewModel2.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
