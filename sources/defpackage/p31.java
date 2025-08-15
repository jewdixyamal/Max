package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: p31  reason: default package */
public final class p31 implements nl, rl {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public p31(je7 je7, je7 je72, je7 je73, int i) {
        switch (i) {
            case 1:
                this.a = je73;
                this.b = je7;
                this.c = je72;
                return;
            default:
                this.a = je7;
                this.b = je72;
                this.c = je73;
                return;
        }
    }

    public q33 a() {
        return (q33) this.a.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(kotlin.coroutines.Continuation r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            boolean r2 = r1 instanceof defpackage.y4g
            if (r2 == 0) goto L_0x0017
            r2 = r1
            y4g r2 = (defpackage.y4g) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.Z = r3
            goto L_0x001c
        L_0x0017:
            y4g r2 = new y4g
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.X
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.Z
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0036
            if (r4 != r5) goto L_0x002e
            p31 r0 = r2.o
            defpackage.od2.a0(r1)
            goto L_0x0093
        L_0x002e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0036:
            defpackage.od2.a0(r1)
            je7 r1 = r0.b
            java.lang.Object r1 = r1.getValue()
            y7d r1 = (defpackage.y7d) r1
            qyc r1 = (defpackage.qyc) r1
            r1.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r4 = ru.ok.tamtam.android.prefs.PmsKey.f136welcomestickerids
            java.lang.String r4 = r4.name()
            java.util.List r1 = r1.h(r4, r6)
            r4 = 0
            if (r1 == 0) goto L_0x005d
            java.lang.String[] r7 = new java.lang.String[r4]
            java.lang.Object[] r1 = r1.toArray(r7)
            java.lang.String[] r1 = (java.lang.String[]) r1
            if (r1 != 0) goto L_0x005f
        L_0x005d:
            java.lang.String[] r1 = new java.lang.String[r4]
        L_0x005f:
            int r4 = r1.length
            if (r4 != 0) goto L_0x0063
            return r6
        L_0x0063:
            m4c r4 = defpackage.n4c.a
            int r7 = r1.length
            if (r7 == 0) goto L_0x00cc
            int r7 = r1.length
            r4.getClass()
            d3 r4 = defpackage.n4c.b
            int r4 = r4.g(r7)
            r1 = r1[r4]
            if (r1 == 0) goto L_0x00cb
            java.lang.Long r1 = defpackage.dae.f0(r1)
            if (r1 == 0) goto L_0x00cb
            long r7 = r1.longValue()
            je7 r1 = r0.a
            java.lang.Object r1 = r1.getValue()
            y4e r1 = (defpackage.y4e) r1
            r2.o = r0
            r2.Z = r5
            java.io.Serializable r1 = r1.a(r7, r2)
            if (r1 != r3) goto L_0x0093
            return r3
        L_0x0093:
            d2e r1 = (defpackage.d2e) r1
            if (r1 == 0) goto L_0x00cb
            z2e r2 = new z2e
            je7 r0 = r0.c
            java.lang.Object r0 = r0.getValue()
            qe5 r0 = (defpackage.qe5) r0
            se5 r0 = (defpackage.se5) r0
            boolean r0 = r0.w()
            if (r0 == 0) goto L_0x00ab
            java.lang.String r6 = r1.z0
        L_0x00ab:
            r16 = r6
            r20 = 0
            r21 = 0
            long r8 = r1.a
            long r12 = r1.v0
            r10 = r12
            java.lang.String r14 = r1.s0
            java.lang.String r15 = r1.w0
            int r0 = r1.b
            r17 = r0
            int r0 = r1.c
            r18 = r0
            r19 = 0
            r23 = 7744(0x1e40, float:1.0852E-41)
            r7 = r2
            r7.<init>(r8, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r23)
            r6 = r2
        L_0x00cb:
            return r6
        L_0x00cc:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Array is empty."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p31.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public ql d() {
        String str = (String) j47.f0(hz4.a, new o31(this, (Continuation) null));
        qyc qyc = (qyc) ((y7d) this.b.getValue());
        qyc.getClass();
        String w = qyc.w(PmsKey.f16callsendpoint, (String) null);
        if (w == null) {
            w = "";
        }
        return new ql(str, w);
    }

    public ml getSessionInfo() {
        try {
            hyc hyc = (hyc) a();
            hyc.getClass();
            List arrayList = new ArrayList();
            String string = hyc.g.getString("user.callSession", (String) null);
            if (string != null) {
                arrayList = Arrays.asList(TextUtils.split(string, ","));
            }
            if (arrayList == null) {
                return null;
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            if (arrayList.size() < 3) {
                return null;
            }
            return new ml((String) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2));
        } catch (Throwable th) {
            hm9.l("OKConfigStoreTag", "Call session info cache error: ", th);
            return null;
        }
    }

    public void setSessionInfo(ml mlVar) {
        if (mlVar == null) {
            q33 a2 = a();
            nz4 nz4 = nz4.a;
            hyc hyc = (hyc) a2;
            hyc.getClass();
            String join = TextUtils.join(",", nz4);
            ji5 ji5 = (ji5) hyc.g.edit();
            ji5.putString("user.callSession", join);
            ji5.apply();
            return;
        }
        q33 a3 = a();
        List M = y53.M(mlVar.a, mlVar.b, mlVar.c);
        hyc hyc2 = (hyc) a3;
        hyc2.getClass();
        String join2 = TextUtils.join(",", M);
        ji5 ji52 = (ji5) hyc2.g.edit();
        ji52.putString("user.callSession", join2);
        ji52.apply();
    }
}
