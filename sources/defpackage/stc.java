package defpackage;

import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* renamed from: stc  reason: default package */
public final class stc extends ffe implements a66 {
    public final /* synthetic */ csc X;
    public final /* synthetic */ ScheduledSendPickerViewModel Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public stc(csc csc, ScheduledSendPickerViewModel scheduledSendPickerViewModel, Continuation continuation) {
        super(2, continuation);
        this.X = csc;
        this.Y = scheduledSendPickerViewModel;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((stc) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new stc(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        Object obj2;
        etc etc;
        int i;
        od2.a0(obj);
        csc csc = this.X;
        LinkedHashMap linkedHashMap = csc.a;
        try {
            obj2 = linkedHashMap.get("ScheduledSendPickerViewModel:delayed_attrs");
        } catch (ClassCastException unused) {
            linkedHashMap.remove("ScheduledSendPickerViewModel:delayed_attrs");
            au1.r(csc.c.remove("ScheduledSendPickerViewModel:delayed_attrs"));
            csc.d.remove("ScheduledSendPickerViewModel:delayed_attrs");
            obj2 = null;
        }
        ng4 ng4 = obj2 instanceof ng4 ? (ng4) obj2 : null;
        ScheduledSendPickerViewModel scheduledSendPickerViewModel = this.Y;
        if (ng4 != null) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(ng4.a);
            int i2 = instance.get(5);
            int i3 = instance.get(2);
            int i4 = instance.get(1);
            int i5 = instance.get(11);
            int i6 = instance.get(12);
            etc e = ScheduledSendPickerViewModel.e(scheduledSendPickerViewModel);
            etc e2 = ScheduledSendPickerViewModel.e(scheduledSendPickerViewModel);
            etc e3 = ScheduledSendPickerViewModel.e(scheduledSendPickerViewModel);
            List list = e.a;
            Iterator it = list.iterator();
            int i7 = 0;
            while (true) {
                i = -1;
                if (!it.hasNext()) {
                    i7 = -1;
                    break;
                }
                x34 x34 = (x34) it.next();
                if (x34.o == i4 && x34.c == i3 && x34.b == i2) {
                    break;
                }
                i7++;
            }
            int i8 = i7 < 0 ? 0 : i7;
            List list2 = e2.b;
            Iterator it2 = list2.iterator();
            int i9 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i9 = -1;
                    break;
                } else if (((qte) it2.next()).a == i5) {
                    break;
                } else {
                    i9++;
                }
            }
            int i10 = i9 < 0 ? 0 : i9;
            List list3 = e3.c;
            Iterator it3 = list3.iterator();
            int i11 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                } else if (((qte) it3.next()).a == i6) {
                    i = i11;
                    break;
                } else {
                    i11++;
                }
            }
            etc = new etc(list, list2, list3, i8, i10, i < 0 ? 0 : i);
        } else {
            etc = ScheduledSendPickerViewModel.e(scheduledSendPickerViewModel);
        }
        scheduledSendPickerViewModel.e.m((Object) null, new m34((x34) etc.a.get(etc.d), (qte) etc.b.get(etc.e), (qte) etc.c.get(etc.f)));
        scheduledSendPickerViewModel.c.m((Object) null, etc);
        return e5f.a;
    }
}
