package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Path;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import one.me.chats.search.ChatsListSearchScreen;
import org.apache.http.util.LangUtils;
import org.webrtc.DataChannel;
import ru.ok.tamtam.nano.Protos;

/* renamed from: imc  reason: default package */
public final class imc implements i7, ao0, tge, bha, ab3, DataChannel.Observer, a76, dn6, vaf, erd, ik8, nr4, pma {
    public static d7g X;
    public static final Object o = new Object();
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ imc(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public static ukg F(Context context, Intent intent, boolean z) {
        d7g d7g;
        synchronized (o) {
            try {
                if (X == null) {
                    X = new d7g(context);
                }
                d7g = X;
            } finally {
                while (true) {
                }
            }
        }
        if (!z) {
            return d7g.b(intent).j(new cs(2), new nc5(26));
        }
        if (c8d.r().v(context)) {
            synchronized (prf.b) {
                try {
                    prf.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        prf.c.a(prf.a);
                    }
                    d7g.b(intent).i(new gte(16, (Object) intent));
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            d7g.b(intent);
        }
        return j1e.r(-1);
    }

    public static zq4[] J(zq4 zq4, zq4 zq42, zq4 zq43) {
        float f = zq4.a;
        float f2 = zq42.a;
        float f3 = f - f2;
        float f4 = zq4.b;
        float f5 = zq42.b;
        float f6 = f4 - f5;
        float f7 = zq43.a;
        float f8 = f2 - f7;
        float f9 = zq43.b;
        float f10 = f5 - f9;
        float f11 = (f + f2) / 2.0f;
        float f12 = (f4 + f5) / 2.0f;
        float f13 = (f2 + f7) / 2.0f;
        float f14 = (f9 + f5) / 2.0f;
        float sqrt = (float) Math.sqrt((double) ((f6 * f6) + (f3 * f3)));
        float sqrt2 = (float) Math.sqrt((double) ((f10 * f10) + (f8 * f8)));
        float f15 = f11 - f13;
        float f16 = f12 - f14;
        float f17 = sqrt2 / (sqrt + sqrt2);
        if (Float.isNaN(f17)) {
            f17 = 0.0f;
        }
        float f18 = zq42.a - ((f15 * f17) + f13);
        float f19 = f5 - ((f16 * f17) + f14);
        return new zq4[]{new zq4(f11 + f18, f12 + f19), new zq4(f13 + f18, f14 + f19)};
    }

    public void A(int i, yj8 yj8, pc8 pc8) {
        Pair R = R(i, yj8);
        if (R != null) {
            ((bie) ((di6) ((vk8) this.c).k)).d(new nk8(this, R, pc8, 0));
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [jo7, java.lang.Object] */
    public bm7 B(byte[] bArr) {
        byte[] bArr2;
        jo7 jo7 = (jo7) this.c;
        if (jo7 == null || (bArr2 = (byte[]) jo7.a) == null || !Arrays.equals(bArr2, bArr)) {
            bm7 B = ((ao0) this.b).B(bArr);
            ? obj = new Object();
            obj.a = bArr;
            obj.b = null;
            obj.c = B;
            this.c = obj;
            return B;
        }
        bm7 bm7 = (bm7) ((jo7) this.c).c;
        fm9.l(bm7);
        return bm7;
    }

    public void C(int i, yj8 yj8) {
        Pair R = R(i, yj8);
        if (R != null) {
            ((bie) ((di6) ((vk8) this.c).k)).d(new ok8(this, R, 3));
        }
    }

    public void D(int i, yj8 yj8) {
        Pair R = R(i, yj8);
        if (R != null) {
            ((bie) ((di6) ((vk8) this.c).k)).d(new ok8(this, R, 1));
        }
    }

    public ypa E(xm6 xm6, pm6 pm6) {
        return new ph4((Object) ((dn6) this.b).E(xm6, pm6), (Object) (List) this.c);
    }

    public boolean G(j7 j7Var, Menu menu) {
        ViewGroup viewGroup = ((dn) this.c).L0;
        WeakHashMap weakHashMap = zmf.a;
        mmf.c(viewGroup);
        return ((i7) this.b).G(j7Var, menu);
    }

    public void H(int i, yj8 yj8) {
        Pair R = R(i, yj8);
        if (R != null) {
            ((bie) ((di6) ((vk8) this.c).k)).d(new ok8(this, R, 2));
        }
    }

    public void I(CharSequence charSequence) {
        String str;
        bc7[] bc7Arr = ChatsListSearchScreen.J0;
        gw2 n0 = ((ChatsListSearchScreen) this.b).n0();
        String str2 = "";
        if (charSequence == null || (str = charSequence.toString()) == null) {
            str = str2;
        }
        q0e q0e = n0.E0;
        if (str.equals(((ov2) q0e.getValue()).b)) {
            hm9.m(n0.J0, "Same query for search, ignore it", new Object[0]);
            return;
        }
        String str3 = ((ov2) q0e.getValue()).b;
        if (str3 != null) {
            str2 = str3;
        }
        q0e.m((Object) null, new ov2(nv2.a, str, it6.d, (str.length() <= 0 || !w9e.T0(str, str2)) ? nz4.a : ((ov2) q0e.getValue()).d, true));
        if (str.length() == 0) {
            n0.t(false);
            return;
        }
        vxd vxd = n0.M0;
        if (vxd != null) {
            vxd.cancel((CancellationException) null);
        }
        n0.o.d();
        vxd vxd2 = n0.N0;
        if (vxd2 != null) {
            vxd2.cancel((CancellationException) null);
        }
        x77 x77 = (x77) n0.P0.T0(n0, gw2.Q0[0]);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        n0.G0.m((Object) null, str);
    }

    public void K() {
        bkb bkb = (bkb) this.b;
        if (bkb != null) {
            ((AtomicBoolean) bkb.b).set(true);
            ((ScheduledFuture) bkb.a).cancel(true);
        }
        this.b = null;
    }

    public void L(int i, yj8 yj8, pc8 pc8) {
        Pair R = R(i, yj8);
        if (R != null) {
            ((bie) ((di6) ((vk8) this.c).k)).d(new nk8(this, R, pc8, 1));
        }
    }

    public void M(Object obj, String str) {
        obj.getClass();
        ((HashMap) this.b).put(str, obj);
        ((ArrayList) this.c).remove(str);
    }

    public void N() {
        this.b = null;
        this.c = null;
    }

    public s9 O() {
        return new s9((xq4) this.b);
    }

    public boolean P(int i) {
        return ((tm5) this.b).a.get(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e A[SYNTHETIC, Splitter:B:26:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap Q(android.net.Uri r17, boolean r18) {
        /*
            r16 = this;
            r1 = r17
            java.lang.String r0 = "r"
            r2 = r16
            java.lang.Object r2 = r2.b
            android.content.ContentResolver r2 = (android.content.ContentResolver) r2
            r3 = 0
            r4 = 1
            android.os.ParcelFileDescriptor r5 = r2.openFileDescriptor(r1, r0)     // Catch:{ IOException -> 0x0086, all -> 0x0084 }
            java.io.FileDescriptor r6 = r5.getFileDescriptor()     // Catch:{ IOException -> 0x0041 }
            ph4 r7 = defpackage.j47.X     // Catch:{ IOException -> 0x0041 }
            c65 r7 = new c65     // Catch:{ IOException -> 0x0041 }
            r7.<init>((java.io.FileDescriptor) r6)     // Catch:{ IOException -> 0x0041 }
            java.lang.String r6 = "Orientation"
            int r6 = r7.e(r4, r6)     // Catch:{ IOException -> 0x0041 }
            r5.close()     // Catch:{ IOException -> 0x0041 }
            android.os.ParcelFileDescriptor r5 = r2.openFileDescriptor(r1, r0)     // Catch:{ IOException -> 0x0041 }
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch:{ IOException -> 0x0041 }
            android.graphics.Point r7 = defpackage.j47.D(r7, r6)     // Catch:{ IOException -> 0x0041 }
            r5.close()     // Catch:{ IOException -> 0x0041 }
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x0041 }
            r8.<init>()     // Catch:{ IOException -> 0x0041 }
            if (r18 == 0) goto L_0x0043
            r8.inMutable = r4     // Catch:{ IOException -> 0x0041 }
            goto L_0x0043
        L_0x003d:
            r0 = move-exception
            r3 = r5
            goto L_0x00cd
        L_0x0041:
            r0 = move-exception
            goto L_0x0088
        L_0x0043:
            r9 = 2048(0x800, float:2.87E-42)
            int r7 = defpackage.j47.I(r7, r9, r9)     // Catch:{ IOException -> 0x0041 }
            r8.inSampleSize = r7     // Catch:{ IOException -> 0x0041 }
            android.os.ParcelFileDescriptor r5 = r2.openFileDescriptor(r1, r0)     // Catch:{ IOException -> 0x0041 }
            java.io.FileDescriptor r0 = r5.getFileDescriptor()     // Catch:{ IOException -> 0x0041 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFileDescriptor(r0, r3, r8)     // Catch:{ IOException -> 0x0041 }
            r5.close()     // Catch:{ IOException -> 0x0041 }
            int r2 = defpackage.j47.K(r6)     // Catch:{ IOException -> 0x0041 }
            if (r2 != 0) goto L_0x0064
            defpackage.s5c.m(r5)
            return r0
        L_0x0064:
            android.graphics.Matrix r14 = new android.graphics.Matrix     // Catch:{ IOException -> 0x0041 }
            r14.<init>()     // Catch:{ IOException -> 0x0041 }
            float r2 = (float) r2     // Catch:{ IOException -> 0x0041 }
            r14.setRotate(r2)     // Catch:{ IOException -> 0x0041 }
            int r12 = r0.getWidth()     // Catch:{ IOException -> 0x0041 }
            int r13 = r0.getHeight()     // Catch:{ IOException -> 0x0041 }
            r10 = 0
            r11 = 0
            r15 = 1
            r9 = r0
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ IOException -> 0x0041 }
            r0.recycle()     // Catch:{ IOException -> 0x0041 }
            defpackage.s5c.m(r5)
            return r2
        L_0x0084:
            r0 = move-exception
            goto L_0x00cd
        L_0x0086:
            r0 = move-exception
            r5 = r3
        L_0x0088:
            boolean r2 = r0 instanceof java.io.FileNotFoundException     // Catch:{ all -> 0x003d }
            java.lang.String r6 = "imc"
            if (r2 == 0) goto L_0x00c4
            java.lang.String r0 = r17.toString()     // Catch:{ all -> 0x003d }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00ab }
            r1.<init>(r0)     // Catch:{ all -> 0x00ab }
            boolean r1 = r1.exists()     // Catch:{ all -> 0x00ab }
            if (r1 != 0) goto L_0x00ad
            java.lang.String r1 = "file by path %s not exists"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00ab }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)     // Catch:{ all -> 0x00ab }
            defpackage.hm9.k0(r6, r3, r1, r0)     // Catch:{ all -> 0x00ab }
            goto L_0x00c0
        L_0x00ab:
            r0 = move-exception
            goto L_0x00bb
        L_0x00ad:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x00ab }
            r1.<init>()     // Catch:{ all -> 0x00ab }
            if (r18 == 0) goto L_0x00b6
            r1.inMutable = r4     // Catch:{ all -> 0x00ab }
        L_0x00b6:
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r0, r1)     // Catch:{ all -> 0x00ab }
            goto L_0x00c0
        L_0x00bb:
            java.lang.String r1 = "getBitmapFromExternalStorage fail"
            defpackage.hm9.l0(r6, r1, r0)     // Catch:{ all -> 0x003d }
        L_0x00c0:
            defpackage.s5c.m(r5)
            return r3
        L_0x00c4:
            java.lang.String r1 = "getBitmapFromPath: failed to get bitmap"
            defpackage.hm9.p(r6, r1, r0)     // Catch:{ all -> 0x003d }
            defpackage.s5c.m(r5)
            return r3
        L_0x00cd:
            defpackage.s5c.m(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.imc.Q(android.net.Uri, boolean):android.graphics.Bitmap");
    }

    public Pair R(int i, yj8 yj8) {
        yj8 yj82;
        tk8 tk8 = (tk8) this.b;
        yj8 yj83 = null;
        if (yj8 != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= tk8.c.size()) {
                    yj82 = null;
                    break;
                } else if (((yj8) tk8.c.get(i2)).d == yj8.d) {
                    Object obj = tk8.b;
                    int i3 = b5b.n;
                    yj82 = yj8.a(Pair.create(obj, yj8.a));
                    break;
                } else {
                    i2++;
                }
            }
            if (yj82 == null) {
                return null;
            }
            yj83 = yj82;
        }
        return Pair.create(Integer.valueOf(i + tk8.d), yj83);
    }

    public synchronized Map S() {
        try {
            if (((Map) this.c) == null) {
                this.c = Collections.unmodifiableMap(new HashMap((HashMap) this.b));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return (Map) this.c;
    }

    public void T(List list) {
        n4e n4e = (n4e) ((khe) this.c).getValue();
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d2e d2e = (d2e) it.next();
            arrayList.add(new u2e(0, d2e.a, d2e.b, d2e.c, d2e.o, d2e.X, d2e.Y, d2e.Z, d2e.s0, d2e.t0, d2e.u0, d2e.v0, d2e.w0, d2e.x0, d2e.y0, d2e.z0));
        }
        ilc ilc = n4e.a;
        ilc.b();
        ilc.c();
        try {
            n4e.b.B(arrayList);
            ilc.r();
        } finally {
            ilc.l();
        }
    }

    public void V(tpa tpa) {
        ((ci9) this.b).i(tpa);
        boolean z = tpa instanceof oma;
        dcd dcd = (dcd) this.c;
        if (z) {
            dcd.j((oma) tpa);
        } else if (tpa instanceof mma) {
            dcd.k(((mma) tpa).c);
        }
    }

    public void W(MotionEvent motionEvent) {
        ArrayList arrayList = (ArrayList) this.c;
        arrayList.add(new zq4(motionEvent.getX(), motionEvent.getY()));
        int size = arrayList.size();
        xq4 xq4 = (xq4) this.b;
        if (size == 2) {
            float f = ((zq4) arrayList.get(0)).a;
            float f2 = ((zq4) arrayList.get(0)).b;
            float f3 = ((zq4) arrayList.get(1)).a;
            float f4 = ((zq4) arrayList.get(1)).b;
            xq4.a.add(new yq4(1, new float[]{f, f2, f3, f4}));
            Path path = xq4.b;
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
        }
        if (arrayList.size() > 3) {
            zq4[] J = J((zq4) arrayList.get(0), (zq4) arrayList.get(1), (zq4) arrayList.get(2));
            zq4[] J2 = J((zq4) arrayList.get(1), (zq4) arrayList.get(2), (zq4) arrayList.get(3));
            float f5 = ((zq4) arrayList.get(1)).a;
            float f6 = ((zq4) arrayList.get(1)).b;
            zq4 zq4 = J[1];
            float f7 = zq4.a;
            zq4 zq42 = J2[0];
            float f8 = zq42.a;
            float f9 = ((zq4) arrayList.get(2)).a;
            float f10 = ((zq4) arrayList.get(2)).b;
            float f11 = zq4.b;
            float f12 = zq42.b;
            xq4.a.add(new yq4(2, new float[]{f5, f6, f7, f11, f8, f12, f9, f10}));
            Path path2 = xq4.b;
            path2.moveTo(f5, f6);
            float f13 = f9;
            path2.cubicTo(f7, f11, f8, f12, f13, f10);
            arrayList.remove(0);
        }
    }

    public void X(Exception exc, boolean z) {
        this.c = null;
        HashSet hashSet = (HashSet) this.b;
        zw6 j = zw6.j(hashSet);
        hashSet.clear();
        ls5 l = j.listIterator(0);
        while (l.hasNext()) {
            x94 x94 = (x94) l.next();
            x94.getClass();
            x94.j(exc, z ? 1 : 3);
        }
    }

    public ukg Y(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.b;
        boolean z2 = context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) != 0) {
            z = true;
        }
        if (z2 && !z) {
            return F(context, intent, z);
        }
        u24 u24 = new u24(context, 4, intent);
        cs csVar = (cs) this.c;
        return j1e.g(u24, csVar).k(csVar, new xd5(context, intent, z, 0));
    }

    public void Z(x94 x94) {
        ((HashSet) this.b).add(x94);
        if (((x94) this.c) == null) {
            this.c = x94;
            r65 d = x94.b.d();
            x94.y = d;
            t94 t94 = x94.s;
            int i = oaf.a;
            d.getClass();
            t94.getClass();
            t94.obtainMessage(1, new v94(yn7.b.getAndIncrement(), true, SystemClock.elapsedRealtime(), d)).sendToTarget();
        }
    }

    public void a(Object obj) {
        switch (this.a) {
            case LangUtils.HASH_SEED /*17*/:
                Void voidR = (Void) obj;
                ((b15) this.c).k.n.remove((e05) this.b);
                return;
            default:
                ((erd) this.b).a(obj);
                return;
        }
    }

    public xy a0() {
        File file = (File) this.b;
        if (file.exists()) {
            File file2 = (File) this.c;
            if (file2.exists()) {
                file.delete();
            } else if (!file.renameTo(file2)) {
                z04.c0("Couldn't rename file " + file + " to backup file " + file2);
            }
        }
        try {
            return new xy(file, 1);
        } catch (FileNotFoundException e) {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file, e);
            }
            try {
                return new xy(file, 1);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + file, e2);
            }
        }
    }

    public void b() {
        ((ab3) this.c).b();
    }

    public void c(zl4 zl4) {
        switch (this.a) {
            case Protos.Attaches.Attach.PRESENT /*12*/:
                dm4.c((AtomicReference) this.b, zl4);
                return;
            default:
                dm4.e((AtomicReference) this.c, zl4);
                return;
        }
    }

    public void d(Throwable th) {
        b15 b15 = (b15) this.c;
        b15.k.n.remove((e05) this.b);
        boolean z = th instanceof MediaCodec.CodecException;
        d15 d15 = b15.k;
        if (z) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
            d15.getClass();
            d15.b(1, codecException.getMessage(), codecException);
            return;
        }
        d15.b(0, th.getMessage(), th);
    }

    public void e(int i, yj8 yj8, yn7 yn7, pc8 pc8, IOException iOException, boolean z) {
        Pair R = R(i, yj8);
        if (R != null) {
            ((bie) ((di6) ((vk8) this.c).k)).d(new dk8((Object) this, (Object) R, (Object) yn7, (Object) pc8, iOException, z, 2));
        }
    }

    public ypa f() {
        return new ph4((Object) ((dn6) this.b).f(), (Object) (List) this.c);
    }

    public int h() {
        return ((FrameLayout) this.c).getMeasuredHeight();
    }

    public boolean i(j7 j7Var, MenuItem menuItem) {
        return ((i7) this.b).i(j7Var, menuItem);
    }

    public int j(Object obj) {
        iy3 iy3 = (iy3) obj;
        if (((nw7) this.c).s0) {
            return iy3.f;
        }
        return ((vaf) this.b).j(iy3.b.e0());
    }

    public int k() {
        return ((FrameLayout) this.c).getBottom();
    }

    public void l(j7 j7Var) {
        ((i7) this.b).l(j7Var);
        dn dnVar = (dn) this.c;
        if (dnVar.H0 != null) {
            dnVar.w0.getDecorView().removeCallbacks(dnVar.I0);
        }
        if (dnVar.G0 != null) {
            vof vof = dnVar.J0;
            if (vof != null) {
                vof.b();
            }
            vof a2 = zmf.a(dnVar.G0);
            a2.a(0.0f);
            dnVar.J0 = a2;
            a2.d(new tm(2, this));
        }
        dnVar.F0 = null;
        ViewGroup viewGroup = dnVar.L0;
        WeakHashMap weakHashMap = zmf.a;
        mmf.c(viewGroup);
        dnVar.G();
    }

    public void m() {
        CallWaitingRoomEventsWidget.p0((CallWaitingRoomEventsWidget) this.b);
    }

    public boolean o(j7 j7Var, wq8 wq8) {
        return ((i7) this.b).o(j7Var, wq8);
    }

    public void onBufferedAmountChange(long j) {
        e24 e24 = (e24) this.c;
        Iterator it = e24.e.iterator();
        while (it.hasNext()) {
            z26 z26 = (z26) it.next();
            try {
                if (e24 == z26.b) {
                    z26.b(z26.g);
                }
            } catch (Throwable th) {
                e24.b.reportException("DataChannelRtcTransport", "rtc.datachannel.buffer.listen", new Exception(th));
            }
        }
    }

    public void onDismiss() {
        CallWaitingRoomEventsWidget.p0((CallWaitingRoomEventsWidget) this.b);
    }

    public void onError(Throwable th) {
        switch (this.a) {
            case Protos.Attaches.Attach.PRESENT /*12*/:
                ((ab3) this.c).onError(th);
                return;
            default:
                ((erd) this.b).onError(th);
                return;
        }
    }

    public void onMessage(DataChannel.Buffer buffer) {
        ByteBuffer byteBuffer = buffer.data;
        byte[] bArr = new byte[byteBuffer.remaining()];
        int i = buffer.binary ? 2 : 1;
        byteBuffer.get(bArr);
        e24 e24 = (e24) this.c;
        Iterator it = e24.d.iterator();
        while (it.hasNext()) {
            try {
                ((uoc) it.next()).a(e24, bArr, i);
            } catch (Throwable th) {
                e24.b.reportException("DataChannelRtcTransport", "rtc.datachannel.listen.response", new Exception(th));
            }
        }
    }

    public void onStateChange() {
        boolean z = ((DataChannel) this.b).state() == DataChannel.State.OPEN;
        e24 e24 = (e24) this.c;
        Iterator it = e24.c.iterator();
        while (it.hasNext()) {
            try {
                ((toc) it.next()).a(e24, z);
            } catch (Throwable th) {
                e24.b.reportException("DataChannelRtcTransport", "rtc.datachannel.handle.connection", new Exception(th));
            }
        }
    }

    public void p() {
        mr0.I((cla) this.c);
        gy2.c.P1().d();
    }

    public View q() {
        return (FrameLayout) this.c;
    }

    public void r(int i, yj8 yj8, yn7 yn7, pc8 pc8) {
        Pair R = R(i, yj8);
        if (R != null) {
            ((bie) ((di6) ((vk8) this.c).k)).d(new pk8(this, R, yn7, pc8, 0));
        }
    }

    public void s(int i, yj8 yj8, Exception exc) {
        Pair R = R(i, yj8);
        if (R != null) {
            ((bie) ((di6) ((vk8) this.c).k)).d(new v05((Object) this, (Object) R, (Object) exc, 19));
        }
    }

    public void t(int i, yj8 yj8, yn7 yn7, pc8 pc8) {
        Pair R = R(i, yj8);
        if (R != null) {
            ((bie) ((di6) ((vk8) this.c).k)).d(new pk8(this, R, yn7, pc8, 2));
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [jo7, java.lang.Object] */
    public bm7 u(Uri uri) {
        Uri uri2;
        jo7 jo7 = (jo7) this.c;
        if (jo7 == null || (uri2 = (Uri) jo7.b) == null || !uri2.equals(uri)) {
            bm7 u = ((ao0) this.b).u(uri);
            ? obj = new Object();
            obj.a = null;
            obj.b = uri;
            obj.c = u;
            this.c = obj;
            return u;
        }
        bm7 bm7 = (bm7) ((jo7) this.c).c;
        fm9.l(bm7);
        return bm7;
    }

    public void w(int i, yj8 yj8, int i2) {
        Pair R = R(i, yj8);
        if (R != null) {
            ((bie) ((di6) ((vk8) this.c).k)).d(new si1((Object) this, (Object) R, i2, 14));
        }
    }

    public void x(int i, yj8 yj8, yn7 yn7, pc8 pc8) {
        Pair R = R(i, yj8);
        if (R != null) {
            ((bie) ((di6) ((vk8) this.c).k)).d(new pk8(this, R, yn7, pc8, 1));
        }
    }

    public int y() {
        return 0;
    }

    public void z(int i, yj8 yj8) {
        Pair R = R(i, yj8);
        if (R != null) {
            ((bie) ((di6) ((vk8) this.c).k)).d(new ok8(this, R, 0));
        }
    }

    public /* synthetic */ imc(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public imc(jlc jlc) {
        this.a = 0;
        this.b = jlc;
        this.c = new khe(new lwa(19, this));
    }

    public imc(xq4 xq4) {
        this.a = 16;
        this.c = new ArrayList();
        this.b = xq4;
    }

    public imc(ux1 ux1) {
        this.a = 10;
        this.b = ux1;
        xm7 xm7 = new xm7();
        this.c = xm7;
        xm7.i(new u90(5, (v90) null));
    }

    public imc(v24 v24) {
        this.a = 6;
        this.b = v24;
    }

    public imc(tf9 tf9, ey1 ey1, p99 p99) {
        this.a = 26;
        m5d m5d = new m5d((o99) ey1, p99, new qc3());
        this.b = tf9;
        this.c = m5d;
    }

    public imc(File file) {
        this.a = 4;
        this.b = file;
        this.c = new File(file.getPath() + ".bak");
    }

    public imc(Context context, int i) {
        this.a = i;
        switch (i) {
            case 29:
                this.b = context;
                this.c = new khe(new zj7(28, this));
                return;
            default:
                this.b = context;
                this.c = new cs(2);
                return;
        }
    }

    public imc(int i) {
        this.a = i;
        switch (i) {
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                this.b = new HashSet();
                return;
            case 19:
                return;
            case 21:
                this.b = new HashMap();
                return;
            case 28:
                this.b = new xm7();
                this.c = new Object();
                V(pma.R);
                return;
            default:
                this.b = new HashMap();
                this.c = new ArrayList();
                return;
        }
    }

    public imc(fn0 fn0) {
        this.a = 5;
        this.c = fn0;
    }

    public imc(tm5 tm5, SparseArray sparseArray) {
        this.a = 2;
        this.b = tm5;
        SparseBooleanArray sparseBooleanArray = tm5.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int b2 = tm5.b(i);
            fd fdVar = (fd) sparseArray.get(b2);
            fdVar.getClass();
            sparseArray2.append(b2, fdVar);
        }
        this.c = sparseArray2;
    }

    public imc(fu1 fu1) {
        this.a = 9;
        this.c = fu1;
        this.b = null;
    }
}
