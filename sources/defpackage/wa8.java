package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.List;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: wa8  reason: default package */
public final /* synthetic */ class wa8 implements ru0, w56, hi8, rj8, pj3, qj8 {
    public final /* synthetic */ int a;

    public /* synthetic */ wa8(int i) {
        this.a = i;
    }

    public void a(nh8 nh8, int i) {
        switch (this.a) {
            case 7:
                nh8.getClass();
                return;
            case 8:
                nh8.getClass();
                return;
            default:
                nh8.b(i);
                return;
        }
    }

    public void accept(Object obj) {
        x4b x4b = (x4b) obj;
        switch (this.a) {
            case Protos.Attaches.Attach.PRESENT /*12*/:
                x4b.pause();
                return;
            case 13:
                x4b.f0();
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                x4b.D0();
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                x4b.L0();
                return;
            case LangUtils.HASH_SEED /*17*/:
                x4b.V();
                return;
            case 18:
                x4b.D();
                return;
            case 20:
                x4b.K0();
                return;
            case 21:
                x4b.J0();
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                x4b.J();
                return;
            case 27:
                x4b.stop();
                return;
            default:
                x4b.prepare();
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [ob8, java.lang.Object] */
    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                x8e x8e = (x8e) obj;
                x8e.getClass();
                Bundle bundle = new Bundle();
                int i = x8e.a;
                if (i != 0) {
                    bundle.putInt(x8e.o, i);
                }
                int i2 = x8e.b;
                if (i2 != 0) {
                    bundle.putInt(x8e.X, i2);
                }
                int i3 = x8e.c;
                if (i3 != 0) {
                    bundle.putInt(x8e.Y, i3);
                }
                return bundle;
            case 4:
                pb8 pb8 = (pb8) obj;
                pb8.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(pb8.h, pb8.a);
                String str = pb8.b;
                if (str != null) {
                    bundle2.putString(pb8.i, str);
                }
                String str2 = pb8.c;
                if (str2 != null) {
                    bundle2.putString(pb8.j, str2);
                }
                int i4 = pb8.d;
                if (i4 != 0) {
                    bundle2.putInt(pb8.k, i4);
                }
                int i5 = pb8.e;
                if (i5 != 0) {
                    bundle2.putInt(pb8.l, i5);
                }
                String str3 = pb8.f;
                if (str3 != null) {
                    bundle2.putString(pb8.m, str3);
                }
                String str4 = pb8.g;
                if (str4 != null) {
                    bundle2.putString(pb8.n, str4);
                }
                return bundle2;
            default:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(pb8.h);
                uri.getClass();
                String string = bundle3.getString(pb8.i);
                String string2 = bundle3.getString(pb8.j);
                int i6 = bundle3.getInt(pb8.k, 0);
                int i7 = bundle3.getInt(pb8.l, 0);
                String string3 = bundle3.getString(pb8.m);
                String string4 = bundle3.getString(pb8.n);
                ? obj2 = new Object();
                obj2.a = uri;
                obj2.b = ia9.l(string);
                obj2.c = string2;
                obj2.d = i6;
                obj2.e = i7;
                obj2.f = string3;
                obj2.g = string4;
                return new pb8(obj2);
        }
    }

    public void b(x4b x4b, oh8 oh8, List list) {
        switch (this.a) {
            case 23:
                x4b.w0(list);
                return;
            default:
                x4b.w0(list);
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v122, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r0v24, types: [dd8, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.su0 g(android.os.Bundle r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            int r0 = r0.a
            switch(r0) {
                case 0: goto L_0x031d;
                case 1: goto L_0x02be;
                case 2: goto L_0x027b;
                default: goto L_0x0009;
            }
        L_0x0009:
            dd8 r0 = new dd8
            r0.<init>()
            r2 = 0
            r3 = 36
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.a = r2
            r2 = 1
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.b = r2
            r2 = 2
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.c = r2
            r2 = 3
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.d = r2
            r2 = 4
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.e = r2
            r2 = 5
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.f = r2
            r2 = 6
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.g = r2
            r2 = 7
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            android.os.Parcelable r2 = r1.getParcelable(r2)
            android.net.Uri r2 = (android.net.Uri) r2
            r0.h = r2
            r2 = 10
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            byte[] r2 = r1.getByteArray(r2)
            r4 = 29
            java.lang.String r5 = java.lang.Integer.toString(r4, r3)
            boolean r5 = r1.containsKey(r5)
            r6 = 0
            if (r5 == 0) goto L_0x008e
            java.lang.String r4 = java.lang.Integer.toString(r4, r3)
            int r4 = r1.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x008f
        L_0x008e:
            r4 = r6
        L_0x008f:
            if (r2 != 0) goto L_0x0092
            goto L_0x0099
        L_0x0092:
            java.lang.Object r2 = r2.clone()
            r6 = r2
            byte[] r6 = (byte[]) r6
        L_0x0099:
            r0.k = r6
            r0.l = r4
            r2 = 11
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            android.os.Parcelable r2 = r1.getParcelable(r2)
            android.net.Uri r2 = (android.net.Uri) r2
            r0.m = r2
            r2 = 22
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.x = r2
            r2 = 23
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.y = r2
            r2 = 24
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.z = r2
            r2 = 27
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.C = r2
            r2 = 28
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.D = r2
            r2 = 30
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.E = r2
            r2 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            android.os.Bundle r2 = r1.getBundle(r2)
            r0.F = r2
            r2 = 8
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            p4c r5 = defpackage.d5c.a
            if (r4 == 0) goto L_0x011f
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            android.os.Bundle r2 = r1.getBundle(r2)
            if (r2 == 0) goto L_0x011f
            su0 r2 = r5.g(r2)
            d5c r2 = (defpackage.d5c) r2
            r0.i = r2
        L_0x011f:
            r2 = 9
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x013d
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            android.os.Bundle r2 = r1.getBundle(r2)
            if (r2 == 0) goto L_0x013d
            su0 r2 = r5.g(r2)
            d5c r2 = (defpackage.d5c) r2
            r0.j = r2
        L_0x013d:
            r2 = 12
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x0157
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.n = r2
        L_0x0157:
            r2 = 13
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x0171
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.o = r2
        L_0x0171:
            r2 = 14
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x018b
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.p = r2
        L_0x018b:
            r2 = 15
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x01a5
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            boolean r2 = r1.getBoolean(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.q = r2
        L_0x01a5:
            r2 = 16
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x01bf
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.r = r2
        L_0x01bf:
            r2 = 17
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x01d9
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.s = r2
        L_0x01d9:
            r2 = 18
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x01f3
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.t = r2
        L_0x01f3:
            r2 = 19
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x020d
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.u = r2
        L_0x020d:
            r2 = 20
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x0227
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.v = r2
        L_0x0227:
            r2 = 21
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x0241
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.w = r2
        L_0x0241:
            r2 = 25
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x025b
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.A = r2
        L_0x025b:
            r2 = 26
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x0275
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r1 = r1.getInt(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.B = r1
        L_0x0275:
            fd8 r1 = new fd8
            r1.<init>(r0)
            return r1
        L_0x027b:
            gb8 r0 = new gb8
            r2 = 0
            r3 = 36
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r6 = r1.getLong(r2, r4)
            r2 = 1
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            long r8 = r1.getLong(r2, r4)
            r2 = 2
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            long r10 = r1.getLong(r2, r4)
            r2 = 3
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            r4 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            float r12 = r1.getFloat(r2, r4)
            r2 = 4
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            float r1 = r1.getFloat(r2, r4)
            r2 = r0
            r3 = r6
            r5 = r8
            r7 = r10
            r9 = r12
            r10 = r1
            r2.<init>(r3, r5, r7, r9, r10)
            return r0
        L_0x02be:
            za8 r0 = new za8
            r0.<init>()
            r2 = 0
            r3 = 36
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            r5 = 0
            long r7 = r1.getLong(r4, r5)
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r9 = 1
            if (r4 < 0) goto L_0x02d7
            r4 = r9
            goto L_0x02d8
        L_0x02d7:
            r4 = r2
        L_0x02d8:
            defpackage.np8.d(r4)
            r0.a = r7
            java.lang.String r4 = java.lang.Integer.toString(r9, r3)
            r7 = -9223372036854775808
            long r10 = r1.getLong(r4, r7)
            int r4 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x02f1
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x02f0
            goto L_0x02f1
        L_0x02f0:
            r9 = r2
        L_0x02f1:
            defpackage.np8.d(r9)
            r0.b = r10
            r4 = 2
            java.lang.String r4 = java.lang.Integer.toString(r4, r3)
            boolean r4 = r1.getBoolean(r4, r2)
            r0.c = r4
            r4 = 3
            java.lang.String r4 = java.lang.Integer.toString(r4, r3)
            boolean r4 = r1.getBoolean(r4, r2)
            r0.d = r4
            r4 = 4
            java.lang.String r3 = java.lang.Integer.toString(r4, r3)
            boolean r1 = r1.getBoolean(r3, r2)
            r0.e = r1
            cb8 r1 = new cb8
            r1.<init>(r0)
            return r1
        L_0x031d:
            r0 = 0
            r2 = 36
            java.lang.String r3 = java.lang.Integer.toString(r0, r2)
            java.lang.String r4 = ""
            java.lang.String r6 = r1.getString(r3, r4)
            r6.getClass()
            r3 = 1
            java.lang.String r4 = java.lang.Integer.toString(r3, r2)
            android.os.Bundle r4 = r1.getBundle(r4)
            r5 = 3
            r7 = 2
            if (r4 != 0) goto L_0x033e
            gb8 r0 = defpackage.gb8.Y
            r9 = r0
            goto L_0x037c
        L_0x033e:
            gb8 r17 = new gb8
            java.lang.String r0 = java.lang.Integer.toString(r0, r2)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r10 = r4.getLong(r0, r8)
            java.lang.String r0 = java.lang.Integer.toString(r3, r2)
            long r12 = r4.getLong(r0, r8)
            java.lang.String r0 = java.lang.Integer.toString(r7, r2)
            long r14 = r4.getLong(r0, r8)
            java.lang.String r0 = java.lang.Integer.toString(r5, r2)
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            float r0 = r4.getFloat(r0, r3)
            r8 = 4
            java.lang.String r8 = java.lang.Integer.toString(r8, r2)
            float r16 = r4.getFloat(r8, r3)
            r8 = r17
            r9 = r10
            r11 = r12
            r13 = r14
            r15 = r0
            r8.<init>(r9, r11, r13, r15, r16)
            r9 = r17
        L_0x037c:
            java.lang.String r0 = java.lang.Integer.toString(r7, r2)
            android.os.Bundle r0 = r1.getBundle(r0)
            if (r0 != 0) goto L_0x038a
            fd8 r0 = defpackage.fd8.S0
        L_0x0388:
            r10 = r0
            goto L_0x0393
        L_0x038a:
            wa8 r3 = defpackage.fd8.T0
            su0 r0 = r3.g(r0)
            fd8 r0 = (defpackage.fd8) r0
            goto L_0x0388
        L_0x0393:
            java.lang.String r0 = java.lang.Integer.toString(r5, r2)
            android.os.Bundle r0 = r1.getBundle(r0)
            if (r0 != 0) goto L_0x03a1
            cb8 r0 = defpackage.cb8.Z
        L_0x039f:
            r7 = r0
            goto L_0x03aa
        L_0x03a1:
            wa8 r1 = defpackage.ab8.Y
            su0 r0 = r1.g(r0)
            cb8 r0 = (defpackage.cb8) r0
            goto L_0x039f
        L_0x03aa:
            rb8 r0 = new rb8
            r8 = 0
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wa8.g(android.os.Bundle):su0");
    }

    public Object k(ii8 ii8, oh8 oh8, int i) {
        switch (this.a) {
            case 10:
                au1.r(ii8);
                throw null;
            case 11:
                au1.r(ii8);
                throw null;
            case 16:
                return ii8.m(oh8);
            case 19:
                au1.r(ii8);
                throw null;
            case 22:
                ii8.s(oh8);
                ii8.e.getClass();
                return fm9.F(new sad(-6));
            case 26:
                au1.r(ii8);
                throw null;
            default:
                au1.r(ii8);
                throw null;
        }
    }

    public /* synthetic */ wa8(Object obj, int i, Object obj2) {
        this.a = i;
    }
}
