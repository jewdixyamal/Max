package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: cle  reason: default package */
public final class cle {
    public final Context a;
    public final crd b = new Object();
    public List c;
    public List d;

    /* JADX WARNING: type inference failed for: r1v1, types: [crd, java.lang.Object] */
    public cle(Context context) {
        this.a = context;
        nz4 nz4 = nz4.a;
        this.c = nz4;
        this.d = nz4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: k60[]} */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, r74] */
    /* JADX WARNING: type inference failed for: r3v7, types: [cjg, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v3, types: [uud, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.uj0[] a(android.os.Handler r13, defpackage.n75 r14, defpackage.n75 r15, defpackage.n75 r16, defpackage.n75 r17) {
        /*
            r12 = this;
            r0 = r12
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            xw0 r10 = defpackage.xw0.Y
            s88 r11 = new s88
            android.content.Context r3 = r0.a
            r6 = 5000(0x1388, double:2.4703E-320)
            crd r4 = r0.b
            r2 = r11
            r5 = r10
            r8 = r13
            r9 = r14
            r2.<init>(r3, r4, r5, r6, r8, r9)
            r1.add(r11)
            r0.d = r1
            r74 r2 = new r74
            r2.<init>()
            s30 r3 = defpackage.s30.c
            r2.a = r3
            r9 = 0
            r2.e = r9
            oz7 r4 = defpackage.oz7.a
            r2.f = r4
            android.content.IntentFilter r4 = new android.content.IntentFilter
            java.lang.String r5 = "android.media.action.HDMI_AUDIO_PLUG"
            r4.<init>(r5)
            r5 = 0
            android.content.Context r6 = r0.a
            android.content.Intent r4 = r6.registerReceiver(r5, r4)
            int r5 = defpackage.maf.a
            r7 = 17
            if (r5 < r7) goto L_0x0062
            java.lang.String r7 = defpackage.maf.c
            java.lang.String r8 = "Amazon"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0052
            java.lang.String r8 = "Xiaomi"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0062
        L_0x0052:
            android.content.ContentResolver r7 = r6.getContentResolver()
            java.lang.String r8 = "external_surround_sound_enabled"
            int r7 = android.provider.Settings.Global.getInt(r7, r8, r9)
            r8 = 1
            if (r7 != r8) goto L_0x0062
            s30 r3 = defpackage.s30.d
            goto L_0x00a4
        L_0x0062:
            r7 = 29
            r8 = 8
            if (r5 < r7) goto L_0x0088
            boolean r7 = defpackage.maf.C(r6)
            if (r7 != 0) goto L_0x007e
            r7 = 23
            if (r5 < r7) goto L_0x0088
            android.content.pm.PackageManager r5 = r6.getPackageManager()
            java.lang.String r6 = "android.hardware.type.automotive"
            boolean r5 = r5.hasSystemFeature(r6)
            if (r5 == 0) goto L_0x0088
        L_0x007e:
            s30 r3 = new s30
            int[] r4 = defpackage.o30.a()
            r3.<init>(r8, r4)
            goto L_0x00a4
        L_0x0088:
            if (r4 == 0) goto L_0x00a4
            java.lang.String r5 = "android.media.extra.AUDIO_PLUG_STATE"
            int r5 = r4.getIntExtra(r5, r9)
            if (r5 != 0) goto L_0x0093
            goto L_0x00a4
        L_0x0093:
            s30 r3 = new s30
            java.lang.String r5 = "android.media.extra.ENCODINGS"
            int[] r5 = r4.getIntArrayExtra(r5)
            java.lang.String r6 = "android.media.extra.MAX_CHANNEL_COUNT"
            int r4 = r4.getIntExtra(r6, r8)
            r3.<init>(r4, r5)
        L_0x00a4:
            r3.getClass()
            r2.a = r3
            r2.c = r9
            r2.d = r9
            r2.e = r9
            cjg r3 = r2.b
            if (r3 != 0) goto L_0x00fd
            cjg r3 = new cjg
            k60[] r4 = new defpackage.k60[r9]
            kpd r5 = new kpd
            r5.<init>()
            uud r6 = new uud
            r6.<init>()
            r7 = 1065353216(0x3f800000, float:1.0)
            r6.c = r7
            r6.d = r7
            i60 r7 = defpackage.i60.e
            r6.e = r7
            r6.f = r7
            r6.g = r7
            r6.h = r7
            java.nio.ByteBuffer r7 = defpackage.k60.a
            r6.k = r7
            java.nio.ShortBuffer r8 = r7.asShortBuffer()
            r6.l = r8
            r6.m = r7
            r7 = -1
            r6.b = r7
            r3.<init>()
            int r7 = r4.length
            int r7 = r7 + 2
            k60[] r7 = new defpackage.k60[r7]
            r3.a = r7
            r8 = 0
            int r11 = r4.length
            java.lang.System.arraycopy(r4, r8, r7, r8, r11)
            r3.b = r5
            r3.c = r6
            int r8 = r4.length
            r7[r8] = r5
            int r4 = r4.length
            int r4 = r4 + 1
            r7[r4] = r6
            r2.b = r3
        L_0x00fd:
            d84 r8 = new d84
            r8.<init>(r2)
            u78 r11 = new u78
            crd r4 = r0.b
            android.content.Context r3 = r0.a
            r2 = r11
            r5 = r10
            r6 = r13
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.add(r11)
            r0.c = r1
            android.os.Looper r0 = r13.getLooper()
            wpe r2 = new wpe
            r3 = r16
            r2.<init>(r3, r0)
            r1.add(r2)
            android.os.Looper r0 = r13.getLooper()
            q99 r2 = new q99
            r3 = r17
            r2.<init>(r3, r0)
            r1.add(r2)
            hx1 r0 = new hx1
            r0.<init>()
            r1.add(r0)
            uj0[] r0 = new defpackage.uj0[r9]
            java.lang.Object[] r0 = r1.toArray(r0)
            uj0[] r0 = (defpackage.uj0[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cle.a(android.os.Handler, n75, n75, n75, n75):uj0[]");
    }
}
