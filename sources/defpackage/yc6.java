package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.photo.GifViewerWidget;

/* renamed from: yc6  reason: default package */
public final class yc6 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ GifViewerWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yc6(Continuation continuation, GifViewerWidget gifViewerWidget) {
        super(2, continuation);
        this.Y = gifViewerWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((yc6) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yc6 yc6 = new yc6(continuation, this.Y);
        yc6.X = obj;
        return yc6;
    }

    /* JADX WARNING: type inference failed for: r7v14, types: [sb8] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            defpackage.od2.a0(r7)
            java.lang.Object r7 = r6.X
            q35 r7 = (defpackage.q35) r7
            bc7[] r0 = one.me.chatmedia.viewer.photo.GifViewerWidget.u0
            one.me.chatmedia.viewer.photo.GifViewerWidget r6 = r6.Y
            r6.getClass()
            boolean r0 = r7 instanceof defpackage.k35
            r1 = 0
            if (r0 == 0) goto L_0x008c
            k35 r7 = (defpackage.k35) r7
            sb8 r0 = r7.a
            java.lang.String r0 = r0.x()
            java.lang.String r2 = r6.m0()
            boolean r0 = defpackage.tpa.f(r0, r2)
            if (r0 == 0) goto L_0x00f8
            sb8 r7 = r7.a
            long r2 = r7.j()
            long r4 = r6.n0()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0035
            goto L_0x00f8
        L_0x0035:
            ck2 r7 = r6.r0()
            long r2 = r6.n0()
            java.lang.String r0 = r6.m0()
            sb8 r7 = r7.y(r2, r0)
            boolean r0 = r7 instanceof defpackage.jb8
            if (r0 == 0) goto L_0x004c
            r1 = r7
            jb8 r1 = (defpackage.jb8) r1
        L_0x004c:
            if (r1 != 0) goto L_0x0050
            goto L_0x00f8
        L_0x0050:
            iwa r7 = r6.o0()
            boolean r7 = r7.getFailure()
            if (r7 == 0) goto L_0x007c
            ck2 r7 = r6.r0()
            long r2 = r6.n0()
            java.lang.String r0 = r6.m0()
            r7.A(r2, r0)
            iwa r7 = r6.o0()
            iwa r6 = r6.o0()
            boolean r6 = r6.getFailure()
            yt6 r0 = r1.o
            r7.r(r0, r6)
            goto L_0x00f8
        L_0x007c:
            ck2 r7 = r6.r0()
            long r0 = r6.n0()
            java.lang.String r6 = r6.m0()
            r7.B(r0, r6)
            goto L_0x00f8
        L_0x008c:
            boolean r0 = r7 instanceof defpackage.l35
            if (r0 == 0) goto L_0x00ce
            l35 r7 = (defpackage.l35) r7
            sb8 r0 = r7.a
            java.lang.String r0 = r0.x()
            java.lang.String r2 = r6.m0()
            boolean r0 = defpackage.tpa.f(r0, r2)
            if (r0 == 0) goto L_0x00f8
            sb8 r7 = r7.a
            long r2 = r7.j()
            long r4 = r6.n0()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x00b1
            goto L_0x00f8
        L_0x00b1:
            r6.s0 = r1
            dkf r7 = r6.p0()
            if (r7 == 0) goto L_0x00c6
            r0 = 0
            r7.L0(r0)
            r7.pause()
            r7.M0(r1)
            r7.N0()
        L_0x00c6:
            amf r6 = r6.q0()
            r6.b()
            goto L_0x00f8
        L_0x00ce:
            boolean r0 = r7 instanceof defpackage.m35
            if (r0 == 0) goto L_0x00f8
            m35 r7 = (defpackage.m35) r7
            jb8 r0 = r7.a
            java.lang.String r0 = r0.Y
            java.lang.String r1 = r6.m0()
            boolean r0 = defpackage.tpa.f(r0, r1)
            if (r0 == 0) goto L_0x00f8
            jb8 r7 = r7.a
            long r0 = r7.a
            long r2 = r6.n0()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00f8
            iwa r6 = r6.o0()
            yt6 r7 = r7.o
            r0 = 1
            r6.r(r7, r0)
        L_0x00f8:
            e5f r6 = defpackage.e5f.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yc6.o(java.lang.Object):java.lang.Object");
    }
}
