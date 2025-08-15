package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import android.widget.EditText;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.core.ProcessingException;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import one.me.deeplink.InvalidDeeplinkNamingException;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.nano.Protos;

/* renamed from: y7g  reason: default package */
public final class y7g implements qj3, edc, ab3, a76, en6, qq6, lq8, pic, qv6 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ y7g(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, w36] */
    public static aa4 v(br7 br7) {
        ib4 ib4 = new ib4();
        ib4.b = null;
        br7.getClass();
        br7.getClass();
        ? obj = new Object();
        np8.d(true);
        obj.b = ib4;
        obj.c = null;
        obj.a = false;
        obj.o = new HashMap();
        br7.getClass();
        throw null;
    }

    public wmc A() {
        cdg cdg;
        try {
            if (((wmc) this.c) == null) {
                eig eig = (eig) this.b;
                Parcel R = eig.R(eig.G0(), 25);
                IBinder readStrongBinder = R.readStrongBinder();
                if (readStrongBinder == null) {
                    cdg = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    cdg = queryLocalInterface instanceof mgg ? (mgg) queryLocalInterface : new cdg(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 3);
                }
                R.recycle();
                this.c = new wmc(cdg, false);
            }
            return (wmc) this.c;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: finally extract failed */
    public void B(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, p3c.AppCompatTextView, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(p3c.AppCompatTextView_emojiCompatEnabled)) {
                z = obtainStyledAttributes.getBoolean(p3c.AppCompatTextView_emojiCompatEnabled, true);
            }
            obtainStyledAttributes.recycle();
            F(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void C(ox5 ox5) {
        int i = ox5.b;
        Handler handler = (Handler) this.c;
        mfe mfe = (mfe) this.b;
        if (i == 0) {
            handler.post(new i76((Object) mfe, 2, (Object) ox5.a));
        } else {
            handler.post(new zj0(i, 1, mfe));
        }
    }

    public void D(Object obj, String str) {
        ((ArrayList) this.c).add(str + "=" + obj);
    }

    public void E(int i, Bundle bundle, Messenger messenger) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = 1;
        if (bundle != null) {
            obtain.setData(bundle);
        }
        obtain.replyTo = messenger;
        ((Messenger) this.b).send(obtain);
    }

    public void F(boolean z) {
        qy4 qy4 = (qy4) ((bx4) this.c).a.c;
        if (qy4.Y != z) {
            if (qy4.c != null) {
                vw4 a2 = vw4.a();
                oy4 oy4 = qy4.c;
                a2.getClass();
                c54.o(oy4, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a2.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a2.b.remove(oy4);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            qy4.Y = z;
            if (z) {
                qy4.a(qy4.a, vw4.a().b());
            }
        }
    }

    public void G(wy7 wy7) {
        try {
            eig eig = (eig) this.b;
            Parcel G0 = eig.G0();
            agg.b(G0, wy7);
            Parcel R = eig.R(G0, 91);
            R.readInt();
            R.recycle();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void H(z16 z16) {
        eig eig = (eig) this.b;
        if (z16 == null) {
            try {
                Parcel G0 = eig.G0();
                agg.c(G0, (IInterface) null);
                eig.H0(G0, 28);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            xeg xeg = new xeg(z16, (byte) 0);
            Parcel G02 = eig.G0();
            agg.c(G02, xeg);
            eig.H0(G02, 28);
        }
    }

    public void I(z16 z16) {
        eig eig = (eig) this.b;
        if (z16 == null) {
            try {
                Parcel G0 = eig.G0();
                agg.c(G0, (IInterface) null);
                eig.H0(G0, 30);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            xeg xeg = new xeg(z16);
            Parcel G02 = eig.G0();
            agg.c(G02, xeg);
            eig.H0(G02, 30);
        }
    }

    public void a(Object obj) {
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                kee kee = (kee) obj;
                kee.getClass();
                try {
                    ((lee) ((o23) this.c).a).c(kee);
                    return;
                } catch (ProcessingException unused) {
                    return;
                }
            default:
                Void voidR = (Void) obj;
                ((Surface) this.b).release();
                ((SurfaceTexture) this.c).release();
                return;
        }
    }

    public void accept(Object obj) {
        sq4 i;
        Uri uri = (Uri) obj;
        Iterator it = ((o20) this.b).g.iterator();
        while (it.hasNext()) {
            ts8 ts8 = (ts8) ((s00) it.next());
            k8g k8g = ts8.w0;
            if (k8g != null && k8g.i() == 1) {
                l20 h = ts8.w0.h(0);
                g20 g20 = h.a;
                g20 g202 = g20.o;
                if (g20 == g202 || s5c.P(h)) {
                    if (TextUtils.equals(h.r, ((l20) this.c).r) && ts8.w0.i() == 1) {
                        l20 h2 = ts8.w0.h(0);
                        if ((h2.a == g202 || s5c.P(h2)) && (i = ts8.o.i(0)) != null) {
                            e2b a2 = s36.a.get();
                            a2.e = wv6.a(ts8.M0.a(h2));
                            a2.l = i.X;
                            i.i(a2.a());
                        }
                    }
                }
            }
        }
    }

    public void b() {
        ab3 ab3 = (ab3) this.b;
        try {
            ((qj3) ((qa3) this.c).c).accept((Object) null);
            ab3.b();
        } catch (Throwable th) {
            c37.B(th);
            ab3.onError(th);
        }
    }

    public void c(zl4 zl4) {
        ((ab3) this.b).c(zl4);
    }

    public void close() {
        ((qv6) this.b).close();
    }

    public void d(Throwable th) {
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                int i = ((iee) this.b).f;
                if (i != 2 || !(th instanceof CancellationException)) {
                    v3c.o(i);
                    return;
                }
                return;
            default:
                throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void e(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r4 = r3.c
            nw7 r4 = (defpackage.nw7) r4
            java.lang.Object r3 = r3.b
            iy3 r3 = (defpackage.iy3) r3
            r4.getClass()
            r3.getClass()
            monitor-enter(r4)
            monitor-enter(r4)     // Catch:{ all -> 0x0056 }
            int r0 = r3.c     // Catch:{ all -> 0x005a }
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x0018
            r0 = r2
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            defpackage.od2.p(r0)     // Catch:{ all -> 0x005a }
            int r0 = r3.c     // Catch:{ all -> 0x005a }
            int r0 = r0 - r2
            r3.c = r0     // Catch:{ all -> 0x005a }
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            monitor-enter(r4)     // Catch:{ all -> 0x0056 }
            boolean r0 = r3.d     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0037
            int r0 = r3.c     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0037
            jn r0 = r4.b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r3.a     // Catch:{ all -> 0x0035 }
            r0.J(r1, r3)     // Catch:{ all -> 0x0035 }
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            r1 = r2
            goto L_0x0038
        L_0x0035:
            r3 = move-exception
            goto L_0x0058
        L_0x0037:
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
        L_0x0038:
            o43 r0 = r4.g(r3)     // Catch:{ all -> 0x0056 }
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            defpackage.o43.S(r0)
            if (r1 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            if (r3 == 0) goto L_0x004f
            w4d r0 = r3.e
            if (r0 == 0) goto L_0x004f
            java.lang.Object r3 = r3.a
            r0.I(r3, r2)
        L_0x004f:
            r4.e()
            r4.c()
            return
        L_0x0056:
            r3 = move-exception
            goto L_0x005d
        L_0x0058:
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            throw r3     // Catch:{ all -> 0x0056 }
        L_0x005a:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005a }
            throw r3     // Catch:{ all -> 0x0056 }
        L_0x005d:
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y7g.e(java.lang.Object):void");
    }

    public zpa f() {
        return new qz7((Object) ((en6) this.b).f(), 19, (Object) (List) this.c);
    }

    public ov6 g() {
        return u(((qv6) this.b).g());
    }

    public o43 get(Object obj) {
        o43 o43 = ((lq8) this.b).get(obj);
        nq8 nq8 = (nq8) this.c;
        if (o43 == null) {
            nq8.i(obj);
        } else {
            nq8.h(obj);
        }
        return o43;
    }

    public long getContentLength() {
        return ((File) this.c).length();
    }

    public String getContentType() {
        return (String) this.b;
    }

    public int getHeight() {
        return ((qv6) this.b).getHeight();
    }

    public int getSizeInBytes() {
        return ((lq8) this.b).getSizeInBytes();
    }

    public Surface getSurface() {
        return ((qv6) this.b).getSurface();
    }

    public int getWidth() {
        return ((qv6) this.b).getWidth();
    }

    public o43 h(Object obj, o43 o43) {
        ((nq8) this.c).n(obj);
        return ((lq8) this.b).h(obj, o43);
    }

    public zpa i(ym6 ym6, qm6 qm6) {
        return new qz7((Object) ((en6) this.b).i(ym6, qm6), 19, (Object) (List) this.c);
    }

    public int j() {
        return ((qv6) this.b).j();
    }

    public void k() {
        ((qv6) this.b).k();
    }

    public void l(pv6 pv6, Executor executor) {
        ((qv6) this.b).l(new y98((Object) this, 16, (Object) pv6), executor);
    }

    public int m() {
        return ((qv6) this.b).m();
    }

    public int n(d7b d7b) {
        return ((lq8) this.b).n(d7b);
    }

    public ov6 o() {
        return u(((qv6) this.b).o());
    }

    public void onError(Throwable th) {
        try {
            ((qj3) ((qa3) this.c).c).accept(th);
        } catch (Throwable th2) {
            c37.B(th2);
            th = new CompositeException(th, th2);
        }
        ((ab3) this.b).onError(th);
    }

    public Size[] p(Size[] sizeArr, int i) {
        List list;
        ArrayList arrayList;
        int i2 = i;
        ArrayList arrayList2 = new ArrayList(Arrays.asList(sizeArr));
        if (((ExtraSupportedOutputSizeQuirk) this.b) != null) {
            Size[] sizeArr2 = (i2 != 34 || !"motorola".equalsIgnoreCase(Build.BRAND) || !"moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[0] : new Size[]{new Size(1440, 1080), new Size(960, 720)};
            if (sizeArr2.length > 0) {
                arrayList2.addAll(Arrays.asList(sizeArr2));
            }
        }
        qqd qqd = (qqd) this.c;
        qqd.getClass();
        if (((ExcludedSupportedSizesQuirk) zi4.a.e(ExcludedSupportedSizesQuirk.class)) == null) {
            list = new ArrayList();
        } else {
            String str = (String) qqd.b;
            String str2 = Build.BRAND;
            if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
                arrayList = new ArrayList();
                if (str.equals("0") && i2 == 256) {
                    arrayList.add(new Size(4160, 3120));
                    arrayList.add(new Size(4000, 3000));
                }
            } else if (!"OnePlus".equalsIgnoreCase(str2) || !"OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                if ("HUAWEI".equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList = new ArrayList();
                    if (str.equals("0") && (i2 == 34 || i2 == 35)) {
                        arrayList.add(new Size(720, 720));
                        arrayList.add(new Size(HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_BAD_REQUEST));
                    }
                } else {
                    if ("SAMSUNG".equalsIgnoreCase(str2) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE)) {
                        arrayList = new ArrayList();
                        if (str.equals("0")) {
                            if (i2 == 34) {
                                arrayList.add(new Size(4128, 3096));
                                arrayList.add(new Size(4128, 2322));
                                arrayList.add(new Size(3088, 3088));
                                arrayList.add(new Size(3264, 2448));
                                arrayList.add(new Size(3264, 1836));
                                arrayList.add(new Size(2048, 1536));
                                arrayList.add(new Size(2048, 1152));
                                arrayList.add(new Size(1920, 1080));
                            } else if (i2 == 35) {
                                arrayList.add(new Size(4128, 2322));
                                arrayList.add(new Size(3088, 3088));
                                arrayList.add(new Size(3264, 2448));
                                arrayList.add(new Size(3264, 1836));
                                arrayList.add(new Size(2048, 1536));
                                arrayList.add(new Size(2048, 1152));
                                arrayList.add(new Size(1920, 1080));
                            }
                        } else if (str.equals("1") && (i2 == 34 || i2 == 35)) {
                            arrayList.add(new Size(3264, 2448));
                            arrayList.add(new Size(3264, 1836));
                            arrayList.add(new Size(2448, 2448));
                            arrayList.add(new Size(1920, 1920));
                            arrayList.add(new Size(2048, 1536));
                            arrayList.add(new Size(2048, 1152));
                            arrayList.add(new Size(1920, 1080));
                        }
                    } else if ("SAMSUNG".equalsIgnoreCase(str2) && "J7XELTE".equalsIgnoreCase(Build.DEVICE)) {
                        arrayList = new ArrayList();
                        if (str.equals("0")) {
                            if (i2 == 34) {
                                arrayList.add(new Size(4128, 3096));
                                arrayList.add(new Size(4128, 2322));
                                arrayList.add(new Size(3088, 3088));
                                arrayList.add(new Size(3264, 2448));
                                arrayList.add(new Size(3264, 1836));
                                arrayList.add(new Size(2048, 1536));
                                arrayList.add(new Size(2048, 1152));
                                arrayList.add(new Size(1920, 1080));
                            } else if (i2 == 35) {
                                arrayList.add(new Size(2048, 1536));
                                arrayList.add(new Size(2048, 1152));
                                arrayList.add(new Size(1920, 1080));
                            }
                        } else if (str.equals("1") && (i2 == 34 || i2 == 35)) {
                            arrayList.add(new Size(2576, 1932));
                            arrayList.add(new Size(2560, 1440));
                            arrayList.add(new Size(1920, 1920));
                            arrayList.add(new Size(2048, 1536));
                            arrayList.add(new Size(2048, 1152));
                            arrayList.add(new Size(1920, 1080));
                        }
                    } else if (!"REDMI".equalsIgnoreCase(str2) || !"joyeuse".equalsIgnoreCase(Build.DEVICE)) {
                        list = Collections.emptyList();
                    } else {
                        arrayList = new ArrayList();
                        if (str.equals("0") && i2 == 256) {
                            arrayList.add(new Size(9280, 6944));
                        }
                    }
                }
            } else {
                arrayList = new ArrayList();
                if (str.equals("0") && i2 == 256) {
                    arrayList.add(new Size(4160, 3120));
                    arrayList.add(new Size(4000, 3000));
                }
            }
            list = arrayList;
        }
        if (!list.isEmpty()) {
            arrayList2.removeAll(list);
        }
        arrayList2.isEmpty();
        return (Size[]) arrayList2.toArray(new Size[0]);
    }

    public boolean q(UnsatisfiedLinkError unsatisfiedLinkError, nud[] nudArr) {
        String str = ((Context) this.b).getApplicationInfo().sourceDir;
        if (new File(str).exists()) {
            return false;
        }
        StringBuilder m = au1.m("Base apk does not exist: ", str, ". ");
        ((sh0) this.c).B(m);
        throw new RuntimeException(m.toString(), unsatisfiedLinkError);
    }

    public Uri r() {
        return c54.h(s(), "max", (String) null);
    }

    public String s() {
        if (eae.o0((String) this.b, ":", false)) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) this.b);
            sb.append('?');
            Iterator it = ((ArrayList) this.c).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append('&');
            }
            sb.deleteCharAt(w9e.v0(sb));
            return sb.toString();
        }
        throw new InvalidDeeplinkNamingException((String) this.b);
    }

    public void t() {
        this.b = null;
        this.c = null;
    }

    public ecd u(ov6 ov6) {
        nje nje;
        if (ov6 == null) {
            return null;
        }
        if (((x9b) this.c) == null) {
            nje = nje.b;
        } else {
            x9b x9b = (x9b) this.c;
            Pair pair = new Pair(x9b.g, x9b.h.get(0));
            nje nje2 = nje.b;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put((String) pair.first, pair.second);
            nje = new nje(arrayMap);
        }
        this.c = null;
        return new ecd(ov6, new Size(ov6.getWidth(), ov6.getHeight()), new qv1(new ik5((pv1) null, nje, ov6.getImageInfo().getTimestamp())));
    }

    public byte[] w(c45 c45) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.b;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = (DataOutputStream) this.c;
        try {
            dataOutputStream.writeBytes(c45.a);
            dataOutputStream.writeByte(0);
            String str = c45.b;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(c45.c);
            dataOutputStream.writeLong(c45.o);
            dataOutputStream.write(c45.X);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        defpackage.v3c.i(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeTo(java.io.OutputStream r2) {
        /*
            r1 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.lang.Object r1 = r1.c
            java.io.File r1 = (java.io.File) r1
            r0.<init>(r1)
            defpackage.ema.l(r0, r2, 8192)     // Catch:{ all -> 0x0011 }
            r1 = 0
            defpackage.v3c.i(r0, r1)
            return
        L_0x0011:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0013 }
        L_0x0013:
            r2 = move-exception
            defpackage.v3c.i(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y7g.writeTo(java.io.OutputStream):void");
    }

    public sr4 x(rb8 rb8) {
        rb8.b.getClass();
        rb8.b.getClass();
        return sr4.a;
    }

    public b y() {
        im imVar = (im) ((WeakReference) this.c).get();
        a aVar = (a) ((WeakReference) this.b).get();
        return (imVar != null || aVar == null) ? imVar : aVar.b0();
    }

    public KeyListener z(KeyListener keyListener) {
        if (!(!(keyListener instanceof NumberKeyListener))) {
            return keyListener;
        }
        ((bx4) this.c).a.getClass();
        if (keyListener instanceof mx4) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new mx4(keyListener);
    }

    public /* synthetic */ y7g(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public y7g(int i) {
        this.a = i;
        switch (i) {
            case 9:
                this.b = new Object();
                return;
            case 13:
                this.b = "";
                this.c = new ArrayList();
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                this.b = new Object();
                return;
            case 16:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                return;
            case 18:
                return;
            case 28:
                this.b = new char[256];
                this.c = new byte[256];
                return;
            default:
                this.b = new AtomicReference(Float.valueOf(0.0f));
                this.c = new AtomicBoolean(false);
                return;
        }
    }

    public y7g(eig eig) {
        this.a = 19;
        new HashMap();
        new HashMap();
        fp3.n(eig);
        this.b = eig;
    }

    public y7g(File file) {
        this.a = 20;
        this.b = "application/octet-stream";
        this.c = file;
    }

    public y7g(k56 k56) {
        this.a = 4;
        this.b = k56;
        this.c = tu0.r(3, new x5(18, this));
    }

    public y7g(ed3 ed3) {
        this.a = 29;
        this.b = ed3;
        this.c = bk4.b();
    }

    public y7g(a aVar) {
        this.a = 12;
        this.b = new WeakReference(aVar);
        this.c = new WeakReference((Object) null);
    }

    public y7g(ilc ilc) {
        this.a = 0;
        this.b = ilc;
        this.c = new x7g(ilc, 0);
    }

    public y7g(im imVar) {
        this.a = 12;
        this.c = new WeakReference(imVar);
        this.b = new WeakReference((Object) null);
    }

    public y7g(String str) {
        this.a = 27;
        this.b = (ExtraSupportedOutputSizeQuirk) zi4.a.e(ExtraSupportedOutputSizeQuirk.class);
        this.c = new qqd(12, (Object) str);
    }

    public y7g(EditText editText) {
        this.a = 2;
        this.b = editText;
        this.c = new bx4(editText, false);
    }

    public y7g(td tdVar) {
        this.a = 26;
        this.b = tdVar;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [dle] */
    /* JADX WARNING: type inference failed for: r0v9, types: [dle] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public y7g(android.content.Context r4, java.lang.Object r5, java.util.LinkedHashSet r6) {
        /*
            r3 = this;
            r0 = 8
            r3.a = r0
            nd2 r0 = new nd2
            r1 = 8
            r0.<init>(r1)
            r3.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.b = r1
            r3.c = r0
            boolean r0 = r5 instanceof defpackage.dx1
            if (r0 == 0) goto L_0x001e
            dx1 r5 = (defpackage.dx1) r5
            goto L_0x0038
        L_0x001e:
            defpackage.ay7.t()
            dx1 r5 = new dx1
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            if (r0 < r1) goto L_0x0030
            fx1 r0 = new fx1
            r0.<init>((android.content.Context) r4, (defpackage.z7) r2)
            goto L_0x0035
        L_0x0030:
            ex1 r0 = new ex1
            r0.<init>((android.content.Context) r4, (defpackage.z7) r2)
        L_0x0035:
            r5.<init>(r0)
        L_0x0038:
            java.util.Iterator r6 = r6.iterator()
        L_0x003c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0059
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            bee r1 = new bee
            java.lang.Object r2 = r3.c
            ht1 r2 = (defpackage.ht1) r2
            r1.<init>(r4, r0, r5, r2)
            java.lang.Object r2 = r3.b
            java.util.HashMap r2 = (java.util.HashMap) r2
            r2.put(r0, r1)
            goto L_0x003c
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y7g.<init>(android.content.Context, java.lang.Object, java.util.LinkedHashSet):void");
    }

    public y7g(fg fgVar) {
        this.a = 1;
        this.c = fgVar;
    }

    public y7g(IBinder iBinder, Bundle bundle) {
        this.a = 23;
        this.b = new Messenger(iBinder);
        this.c = bundle;
    }
}
