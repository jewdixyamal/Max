package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: t68  reason: default package */
public abstract class t68 {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;

    public t68(je7 je7, je7 je72) {
        this.a = je7;
        this.b = je72;
        this.c = new AtomicReference(nz4.a);
        this.d = new khe(new zj7(10, this));
    }

    public void A(int i) {
    }

    public void B(int i) {
    }

    public void C() {
    }

    public void D() {
    }

    public void E(long j) {
    }

    public void F() {
    }

    public void G() {
        zy b2;
        FileOutputStream f;
        try {
            kpa H = H();
            int intValue = ((Number) H.a).intValue();
            o43 o43 = (o43) H.b;
            if (o43 != null) {
                try {
                    String c2 = c();
                    ir6 ir6 = hm9.m;
                    if (ir6 != null) {
                        if (ir6.c()) {
                            us7 us7 = us7.X;
                            int size = ((List) ((AtomicReference) this.c).get()).size();
                            ir6.d(us7, c2, "saveProtoToFile " + size + ", " + intValue + "bytes", (Throwable) null);
                        }
                    }
                    b2 = b();
                    f = b2.f();
                    if (f != null) {
                        f.write((byte[]) o43.e0(), 0, intValue);
                        b2.b(f);
                    }
                    v3c.i(o43, (Throwable) null);
                } catch (Throwable th) {
                    v3c.i(o43, th);
                    throw th;
                }
            } else if (intValue == 0) {
                zy b3 = b();
                if (b3.c.delete() && b3.d.delete()) {
                    b3.e.delete();
                }
            }
        } catch (InterruptedException e) {
            throw e;
        } catch (Throwable th2) {
            hm9.p(c(), "failed to save state", th2);
        }
    }

    public kpa H() {
        qw8 a2 = a();
        int serializedSize = a2.getSerializedSize();
        if (serializedSize == 0) {
            return new kpa(0, (Object) null);
        }
        v84 a3 = ((m5b) ((je7) this.b).getValue()).b().a(serializedSize);
        byte[] bArr = (byte[]) a3.e0();
        String c2 = c();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            float length = ((float) bArr.length) / ((float) LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            ir6.d(us7, c2, "serializeData: size=" + length + "kb, bytes.ref=" + bArr + "}", (Throwable) null);
        }
        Arrays.fill(bArr, 0, bArr.length, (byte) 0);
        qw8.toByteArray(a2, bArr, 0, serializedSize);
        return new kpa(Integer.valueOf(serializedSize), a3);
    }

    public void I(th8 th8, Handler handler) {
        synchronized (this.a) {
            try {
                this.c = new WeakReference(th8);
                cy cyVar = (cy) this.d;
                cy cyVar2 = null;
                if (cyVar != null) {
                    cyVar.removeCallbacksAndMessages((Object) null);
                }
                if (th8 != null) {
                    if (handler != null) {
                        cyVar2 = new cy(this, handler.getLooper(), 12);
                    }
                }
                this.d = cyVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract qw8 a();

    public abstract zy b();

    public String c() {
        return (String) ((khe) this.d).getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.fb9
            if (r0 == 0) goto L_0x0013
            r0 = r7
            fb9 r0 = (defpackage.fb9) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            fb9 r0 = new fb9
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0039
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            defpackage.od2.a0(r7)
            goto L_0x0087
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            t68 r6 = r0.o
            defpackage.od2.a0(r7)
            goto L_0x0060
        L_0x0039:
            defpackage.od2.a0(r7)
            zy r7 = r6.b()
            r0.o = r6
            r0.Z = r4
            java.lang.Object r2 = r6.a
            je7 r2 = (defpackage.je7) r2
            java.lang.Object r2 = r2.getValue()
            kke r2 = (defpackage.kke) r2
            w9a r2 = (defpackage.w9a) r2
            nx3 r2 = r2.b()
            hb9 r4 = new hb9
            r4.<init>(r7, r6, r5)
            java.lang.Object r7 = defpackage.j47.t0(r2, r4, r0)
            if (r7 != r1) goto L_0x0060
            return r1
        L_0x0060:
            byte[] r7 = (byte[]) r7
            if (r7 != 0) goto L_0x0067
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L_0x0067:
            java.lang.Object r2 = r6.a
            je7 r2 = (defpackage.je7) r2
            java.lang.Object r2 = r2.getValue()
            kke r2 = (defpackage.kke) r2
            w9a r2 = (defpackage.w9a) r2
            nx3 r2 = r2.a()
            gb9 r4 = new gb9
            r4.<init>(r6, r7, r5)
            r0.o = r5
            r0.Z = r3
            java.lang.Object r7 = defpackage.j47.t0(r2, r4, r0)
            if (r7 != r1) goto L_0x0087
            return r1
        L_0x0087:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t68.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract Boolean e(byte[] bArr);

    public void f(ja8 ja8) {
    }

    public void g(ja8 ja8, int i) {
    }

    public void h(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }

    public void i(String str, Bundle bundle) {
    }

    public void j() {
    }

    public boolean k(Intent intent) {
        return false;
    }

    public void l() {
    }

    public void m() {
    }

    public void n(String str, Bundle bundle) {
    }

    public void o(String str, Bundle bundle) {
    }

    public void p(Uri uri, Bundle bundle) {
    }

    public void q() {
    }

    public void r(String str, Bundle bundle) {
    }

    public void s(String str, Bundle bundle) {
    }

    public void t(Uri uri, Bundle bundle) {
    }

    public void u(ja8 ja8) {
    }

    public void v() {
    }

    public void w(long j) {
    }

    public void x(float f) {
    }

    public void y(h5c h5c) {
    }

    public void z(h5c h5c) {
    }

    public t68(cj8 cj8) {
        this.d = cj8;
        this.a = new ArrayList();
    }

    public t68() {
        this.a = new Object();
        this.b = new sh8(this);
        this.c = new WeakReference((Object) null);
    }
}
