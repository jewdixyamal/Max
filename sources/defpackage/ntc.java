package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

/* renamed from: ntc  reason: default package */
public final class ntc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ScheduledSendPickerDialogFragment Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ntc(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.Y = scheduledSendPickerDialogFragment;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ntc) n((etc) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ntc ntc = new ntc(this.Y, continuation);
        ntc.X = obj;
        return ntc;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [hdc] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            defpackage.od2.a0(r9)
            java.lang.Object r9 = r8.X
            etc r9 = (defpackage.etc) r9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "new data "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ScheduledSendPickerDialogFragment"
            defpackage.hm9.m(r1, r0, new java.lang.Object[0])
            ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment r8 = r8.Y
            mtc r0 = r8.m1()
            ru.ok.tamtam.messages.scheduled.DateTimePicker r0 = r0.b()
            java.util.List r1 = r9.a
            r2 = 1
            r0.N0 = r2
            androidx.recyclerview.widget.RecyclerView r3 = r0.G0
            hdc r3 = r3.getAdapter()
            boolean r4 = r3 instanceof defpackage.b44
            r5 = 0
            if (r4 == 0) goto L_0x0037
            b44 r3 = (defpackage.b44) r3
            goto L_0x0038
        L_0x0037:
            r3 = r5
        L_0x0038:
            if (r3 == 0) goto L_0x0045
            s34 r4 = new s34
            int r6 = r9.d
            r7 = 0
            r4.<init>(r0, r6, r7)
            r3.F(r1, r4)
        L_0x0045:
            mtc r0 = r8.m1()
            ru.ok.tamtam.messages.scheduled.DateTimePicker r0 = r0.b()
            r0.O0 = r2
            androidx.recyclerview.widget.RecyclerView r1 = r0.H0
            hdc r1 = r1.getAdapter()
            boolean r3 = r1 instanceof defpackage.ste
            if (r3 == 0) goto L_0x005c
            ste r1 = (defpackage.ste) r1
            goto L_0x005d
        L_0x005c:
            r1 = r5
        L_0x005d:
            if (r1 == 0) goto L_0x006c
            s34 r3 = new s34
            int r4 = r9.e
            r6 = 2
            r3.<init>(r0, r4, r6)
            java.util.List r0 = r9.b
            r1.F(r0, r3)
        L_0x006c:
            mtc r8 = r8.m1()
            ru.ok.tamtam.messages.scheduled.DateTimePicker r8 = r8.b()
            r8.P0 = r2
            androidx.recyclerview.widget.RecyclerView r0 = r8.I0
            hdc r0 = r0.getAdapter()
            boolean r1 = r0 instanceof defpackage.ste
            if (r1 == 0) goto L_0x0083
            r5 = r0
            ste r5 = (defpackage.ste) r5
        L_0x0083:
            if (r5 == 0) goto L_0x0092
            s34 r0 = new s34
            int r1 = r9.f
            r2 = 1
            r0.<init>(r8, r1, r2)
            java.util.List r8 = r9.c
            r5.F(r8, r0)
        L_0x0092:
            e5f r8 = defpackage.e5f.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntc.o(java.lang.Object):java.lang.Object");
    }
}
