package ru.ok.tamtam.messages.scheduled;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ok/tamtam/messages/scheduled/ScheduledSendPickerViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lu34;", "Landroid/app/Application;", "app", "Lcsc;", "savedStateHandle", "<init>", "(Landroid/app/Application;Lcsc;)V", "scheduled-send-picker-dialog_release"}, k = 1, mv = {2, 0, 0})
public final class ScheduledSendPickerViewModel extends AndroidViewModel implements u34 {
    public static final /* synthetic */ bc7[] p;
    public final q0e c;
    public final w7c d;
    public final q0e e;
    public final w7c f;
    public final khe g;
    public final khe h = new khe(new hbc(9));
    public final khe i = new khe(new hbc(10));
    public final khe j = new khe(new lwa(23, this));
    public final q0e k;
    public final w7c l;
    public final q0e m;
    public final w7c n;
    public final utc o;

    static {
        Class<ScheduledSendPickerViewModel> cls = ScheduledSendPickerViewModel.class;
        p = new bc7[]{new oi9(cls, "sendWithNotification", "getSendWithNotification()Z"), rh4.g(nec.a, cls, "allowWorkHours", "getAllowWorkHours()Z")};
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [utc, u2] */
    public ScheduledSendPickerViewModel(Application application, csc csc) {
        super(application);
        q0e a = r0e.a((Object) null);
        this.c = a;
        this.d = new w7c(a);
        q0e a2 = r0e.a((Object) null);
        this.e = a2;
        this.f = new w7c(a2);
        this.g = new khe(new lwa(22, application));
        j47.T(f46.R(this), ql4.a, (vx3) null, new stc(csc, this, (Continuation) null), 2);
        Boolean bool = Boolean.TRUE;
        q0e a3 = r0e.a(bool);
        this.k = a3;
        this.l = new w7c(a3);
        q0e a4 = r0e.a((Object) null);
        this.m = a4;
        this.n = new w7c(a4);
        this.o = new u2(9, (Object) bool);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        r4 = r4.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.etc e(ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel r13) {
        /*
            r13.getClass()
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            android.app.Application r1 = r13.b
            android.content.res.Resources r1 = r1.getResources()
            int r2 = defpackage.zsb.small_time_offset
            boolean r1 = r1.getBoolean(r2)
            r2 = 12
            if (r1 == 0) goto L_0x002b
            r1 = 13
            int r1 = r0.get(r1)
            r3 = 35
            if (r1 <= r3) goto L_0x0026
            r1 = 2
            r0.add(r2, r1)
            goto L_0x002f
        L_0x0026:
            r1 = 1
            r0.add(r2, r1)
            goto L_0x002f
        L_0x002b:
            r1 = 5
            r0.add(r2, r1)
        L_0x002f:
            r1 = 11
            int r1 = r0.get(r1)
            q0e r3 = r13.e
            java.lang.Object r4 = r3.getValue()
            m34 r4 = (defpackage.m34) r4
            r5 = 0
            if (r4 == 0) goto L_0x0047
            qte r4 = r4.b
            if (r4 == 0) goto L_0x0047
            int r4 = r4.a
            goto L_0x0048
        L_0x0047:
            r4 = r5
        L_0x0048:
            if (r4 < r1) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r4 = r1
        L_0x004c:
            java.util.ArrayList r8 = defpackage.ngg.w(r1)
            java.util.Iterator r6 = r8.iterator()
            r7 = r5
        L_0x0055:
            boolean r9 = r6.hasNext()
            r10 = -1
            if (r9 == 0) goto L_0x006b
            java.lang.Object r9 = r6.next()
            qte r9 = (defpackage.qte) r9
            int r9 = r9.a
            if (r9 != r4) goto L_0x0068
            r11 = r7
            goto L_0x006c
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x0055
        L_0x006b:
            r11 = r10
        L_0x006c:
            int r0 = r0.get(r2)
            java.lang.Object r2 = r3.getValue()
            m34 r2 = (defpackage.m34) r2
            if (r2 == 0) goto L_0x007f
            qte r2 = r2.c
            if (r2 == 0) goto L_0x007f
            int r2 = r2.a
            goto L_0x0080
        L_0x007f:
            r2 = r5
        L_0x0080:
            if (r4 == r1) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r2 = r0
        L_0x0084:
            if (r4 == r1) goto L_0x0087
            r0 = r5
        L_0x0087:
            java.util.ArrayList r9 = defpackage.ngg.A(r0)
            java.util.Iterator r0 = r9.iterator()
        L_0x008f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a4
            java.lang.Object r1 = r0.next()
            qte r1 = (defpackage.qte) r1
            int r1 = r1.a
            if (r1 != r2) goto L_0x00a1
            r12 = r5
            goto L_0x00a5
        L_0x00a1:
            int r5 = r5 + 1
            goto L_0x008f
        L_0x00a4:
            r12 = r10
        L_0x00a5:
            etc r0 = new etc
            khe r13 = r13.j
            java.lang.Object r13 = r13.getValue()
            r7 = r13
            java.util.List r7 = (java.util.List) r7
            r10 = 0
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel.e(ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel):etc");
    }

    public final void f() {
        x34 x34;
        qte qte;
        qte qte2;
        q0e q0e = this.e;
        m34 m34 = (m34) q0e.getValue();
        if (m34 != null && (x34 = m34.a) != null) {
            Integer num = null;
            if (eae.k0(x34.X, this.b.getString(dpc.u), true)) {
                j47.T(f46.R(this), ql4.a, (vx3) null, new ttc(this, (Continuation) null), 2);
                return;
            }
            m34 m342 = (m34) q0e.getValue();
            x34 x342 = m342 != null ? m342.a : null;
            khe khe = this.j;
            int i2 = 0;
            if (x342 != null) {
                int indexOf = ((List) khe.getValue()).indexOf(x342);
                Integer valueOf = Integer.valueOf(indexOf);
                if (indexOf >= 0) {
                    num = valueOf;
                }
            } else {
                num = 0;
            }
            m34 m343 = (m34) q0e.getValue();
            int i3 = (m343 == null || (qte2 = m343.b) == null) ? 0 : qte2.a;
            m34 m344 = (m34) q0e.getValue();
            int i4 = (m344 == null || (qte = m344.c) == null) ? 0 : qte.a;
            List list = (List) khe.getValue();
            List list2 = (List) this.h.getValue();
            List list3 = (List) this.i.getValue();
            if (num != null) {
                i2 = num.intValue();
            }
            g(new etc(list, list2, list3, i2, i3, i4));
        }
    }

    public final void g(etc etc) {
        hm9.m("ScheduledSendPickerViewModel", "setData %s", etc);
        this.c.m((Object) null, etc);
        this.e.m((Object) null, new m34((x34) etc.a.get(etc.d), (qte) etc.b.get(etc.e), (qte) etc.c.get(etc.f)));
        h();
    }

    public final boolean h() {
        hm9.m("ScheduledSendPickerViewModel", "validateSelectedTime", new Object[0]);
        m34 m34 = (m34) this.e.getValue();
        boolean z = false;
        if (m34 == null) {
            return false;
        }
        if (System.currentTimeMillis() < m34.b()) {
            z = true;
        }
        hm9.m("ScheduledSendPickerViewModel", "validateSelectedTime: " + z, new Object[0]);
        this.k.m((Object) null, Boolean.valueOf(z));
        return z;
    }
}
