package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.c;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.messages.location.TamSupportMapFragment;

/* renamed from: el9  reason: default package */
public final class el9 extends v2 implements dye, nse, kk9 {
    public final u8e A0;
    public TamSupportMapFragment B0;
    public AppCompatImageView C0;
    public Group D0;
    public OneMeButton E0;
    public OneMeButton F0;
    public de7 G0;
    public mj9 H0;
    public ViewStub I0;
    public il9 J0;
    public qy7 K0;
    public ny7 L0;
    public bk4 M0;
    public ValueAnimator N0;
    public ir7 O0;
    public final ida X;
    public final el3 Y;
    public final vy7 Z;
    public final hc3 o = new Object();
    public final ad s0;
    public final c t0;
    public final long u0;
    public final tg v0;
    public final m7b w0;
    public final ztc x0;
    public final ri4 y0;
    public final boolean z0;

    /* JADX WARNING: type inference failed for: r1v1, types: [hc3, java.lang.Object] */
    public el9(Context context, ViewGroup viewGroup, ida ida, el3 el3, vy7 vy7, ad adVar, c cVar, long j, tg tgVar, p7b p7b, ztc ztc, ri4 ri4, boolean z, u8e u8e) {
        super(context);
        this.X = ida;
        this.Y = el3;
        this.Z = vy7;
        this.s0 = adVar;
        this.t0 = cVar;
        this.u0 = j;
        this.v0 = tgVar;
        this.w0 = p7b;
        this.x0 = ztc;
        this.y0 = ri4;
        this.z0 = z;
        this.A0 = u8e;
        l(viewGroup, yyb.frg_location_map);
    }

    public final void A(long j, boolean z) {
        q1a q1a;
        qy7 qy7 = this.K0;
        if (qy7 != null) {
            long j2 = qy7.q;
            qy7.q = j;
            cqc.b(qy7.r);
            vy7 vy7 = qy7.e;
            Context context = (Context) this.b;
            synchronized (vy7) {
                q1a = new q1a(1, new d74(vy7, 22, context));
            }
            drd i = q1a.m(qy7.f).i(ce.a());
            iq1 iq1 = new iq1(new wi0(qy7, j2, z, j), 2, new xw0(25));
            i.k(iq1);
            qy7.r = iq1;
        }
    }

    public final void B(double d, double d2, boolean z) {
        if (this.K0 != null) {
            if (z) {
                double[] D = D();
                if (this.D0.getVisibility() == 0 && Math.abs(D[0] - d) <= 0.001d && Math.abs(D[1] - d2) <= 0.001d) {
                    F();
                }
            }
            qy7 qy7 = this.K0;
            qy7.g.getClass();
            LatLng latLng = new LatLng(d, d2);
            try {
                sfg sfg = mr0.m;
                fp3.o(sfg, "CameraUpdateFactory is not initialized");
                Parcel G02 = sfg.G0();
                agg.b(G02, latLng);
                Parcel R = sfg.R(G02, 8);
                xr6 K02 = oy9.K0(R.readStrongBinder());
                R.recycle();
                qy7.e(new bkg(6, new y8(K02)), true);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v14, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r5v15, types: [cdg] */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01c2, code lost:
        if (r6 != r4) goto L_0x01cc;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C(java.util.List r18, boolean r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r4 = 1
            qy7 r5 = r0.K0
            if (r5 != 0) goto L_0x000a
            return
        L_0x000a:
            int r5 = r18.size()
            if (r5 > r4) goto L_0x0016
            qy7 r0 = r0.K0
            r0.b()
            return
        L_0x0016:
            khe r5 = defpackage.sme.a0
            java.lang.Object r5 = r0.b
            android.content.Context r5 = (android.content.Context) r5
            sme r6 = defpackage.fm9.R(r5)
            if (r1 == 0) goto L_0x0025
            int r6 = r6.k
            goto L_0x0027
        L_0x0025:
            int r6 = r6.M
        L_0x0027:
            qy7 r7 = r0.K0
            bk4 r8 = r0.M0
            int r8 = r8.b
            float r8 = (float) r8
            ir7 r0 = r0.O0
            long r9 = r0.o
            r7.c()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r11 = r18.size()
            r0.<init>(r11)
            java.util.Iterator r11 = r18.iterator()
        L_0x0042:
            boolean r12 = r11.hasNext()
            rxd r13 = r7.d
            if (r12 == 0) goto L_0x00aa
            java.lang.Object r12 = r11.next()
            e08 r12 = (defpackage.e08) r12
            er7 r14 = new er7
            er7 r15 = r12.a
            r16 = r5
            double r4 = r15.a
            double r2 = r15.b
            r14.<init>(r4, r2)
            r0.add(r14)
            kp7 r14 = r7.j
            java.lang.Object r14 = r14.b()
            h08 r14 = (defpackage.h08) r14
            com.google.android.gms.maps.model.LatLng r15 = new com.google.android.gms.maps.model.LatLng
            r15.<init>(r4, r2)
            g08 r2 = r14.a
            r2.a = r15
            r3 = 0
            r2.Z = r3
            r4 = 1056964608(0x3f000000, float:0.5)
            r2.X = r4
            r2.Y = r4
            r2.s0 = r3
            qx7 r2 = r7.h
            r2.getClass()
            sn0 r2 = defpackage.qx7.h()
            g08 r3 = r14.a
            rxd r2 = r2.a
            r3.o = r2
            y8 r2 = r13.T(r14)
            long r3 = r12.j
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            r2.H(r5)
            java.util.LinkedHashMap r5 = r7.b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            xi0 r4 = new xi0
            r4.<init>(r12, r2)
            r5.put(r3, r4)
            r5 = r16
            r4 = 1
            goto L_0x0042
        L_0x00aa:
            r16 = r5
            bkg r2 = r7.o
            r3 = 10
            if (r2 != 0) goto L_0x0156
            kp7 r2 = r7.l
            java.lang.Object r2 = r2.b()
            j5b r2 = (defpackage.j5b) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            int r3 = defpackage.z53.S(r0, r3)
            r4.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x00c7:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00e0
            java.lang.Object r3 = r0.next()
            er7 r3 = (defpackage.er7) r3
            com.google.android.gms.maps.model.LatLng r5 = new com.google.android.gms.maps.model.LatLng
            double r11 = r3.a
            double r14 = r3.b
            r5.<init>(r11, r14)
            r4.add(r5)
            goto L_0x00c7
        L_0x00e0:
            i5b r0 = r2.a
            r0.getClass()
            java.util.Iterator r2 = r4.iterator()
        L_0x00e9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00fb
            java.lang.Object r3 = r2.next()
            com.google.android.gms.maps.model.LatLng r3 = (com.google.android.gms.maps.model.LatLng) r3
            java.util.List r4 = r0.a
            r4.add(r3)
            goto L_0x00e9
        L_0x00fb:
            r0.b = r8
            r0.c = r6
            r2 = 2
            r0.u0 = r2
            r13.getClass()
            java.lang.Object r2 = r13.b
            y7g r2 = (defpackage.y7g) r2
            r2.getClass()
            h5b r3 = new h5b     // Catch:{ RemoteException -> 0x014f }
            java.lang.Object r2 = r2.b     // Catch:{ RemoteException -> 0x014f }
            eig r2 = (defpackage.eig) r2     // Catch:{ RemoteException -> 0x014f }
            android.os.Parcel r4 = r2.G0()     // Catch:{ RemoteException -> 0x014f }
            defpackage.agg.b(r4, r0)     // Catch:{ RemoteException -> 0x014f }
            r0 = 9
            android.os.Parcel r0 = r2.R(r4, r0)     // Catch:{ RemoteException -> 0x014f }
            android.os.IBinder r2 = r0.readStrongBinder()     // Catch:{ RemoteException -> 0x014f }
            int r4 = defpackage.pfg.d     // Catch:{ RemoteException -> 0x014f }
            if (r2 != 0) goto L_0x0129
            r2 = 0
            goto L_0x013e
        L_0x0129:
            java.lang.String r4 = "com.google.android.gms.maps.model.internal.IPolylineDelegate"
            android.os.IInterface r5 = r2.queryLocalInterface(r4)     // Catch:{ RemoteException -> 0x014f }
            boolean r6 = r5 instanceof defpackage.qfg     // Catch:{ RemoteException -> 0x014f }
            if (r6 == 0) goto L_0x0137
            r2 = r5
            qfg r2 = (defpackage.qfg) r2     // Catch:{ RemoteException -> 0x014f }
            goto L_0x013e
        L_0x0137:
            ofg r5 = new ofg     // Catch:{ RemoteException -> 0x014f }
            r6 = 3
            r5.<init>(r2, r4, r6)     // Catch:{ RemoteException -> 0x014f }
            r2 = r5
        L_0x013e:
            r0.recycle()     // Catch:{ RemoteException -> 0x014f }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x014f }
            bkg r0 = new bkg
            r2 = 21
            r0.<init>(r2, r3)
            r7.o = r0
            goto L_0x0225
        L_0x014f:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x0156:
            java.lang.Object r2 = r2.b
            h5b r2 = (defpackage.h5b) r2
            r2.getClass()
            qfg r2 = r2.a     // Catch:{ RemoteException -> 0x0274 }
            ofg r2 = (defpackage.ofg) r2     // Catch:{ RemoteException -> 0x0274 }
            android.os.Parcel r4 = r2.G0()     // Catch:{ RemoteException -> 0x0274 }
            r5 = 4
            android.os.Parcel r2 = r2.R(r4, r5)     // Catch:{ RemoteException -> 0x0274 }
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLng> r4 = com.google.android.gms.maps.model.LatLng.CREATOR     // Catch:{ RemoteException -> 0x0274 }
            java.util.ArrayList r4 = r2.createTypedArrayList(r4)     // Catch:{ RemoteException -> 0x0274 }
            r2.recycle()     // Catch:{ RemoteException -> 0x0274 }
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = defpackage.z53.S(r4, r3)
            r2.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x0180:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0199
            java.lang.Object r5 = r4.next()
            com.google.android.gms.maps.model.LatLng r5 = (com.google.android.gms.maps.model.LatLng) r5
            er7 r8 = new er7
            double r11 = r5.a
            double r13 = r5.b
            r8.<init>(r11, r13)
            r2.add(r8)
            goto L_0x0180
        L_0x0199:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            boolean r2 = r0.equals(r4)
            if (r2 == 0) goto L_0x01cc
            bkg r2 = r7.o
            java.lang.Object r2 = r2.b
            h5b r2 = (defpackage.h5b) r2
            r2.getClass()
            qfg r2 = r2.a     // Catch:{ RemoteException -> 0x01c5 }
            ofg r2 = (defpackage.ofg) r2     // Catch:{ RemoteException -> 0x01c5 }
            android.os.Parcel r4 = r2.G0()     // Catch:{ RemoteException -> 0x01c5 }
            r5 = 8
            android.os.Parcel r2 = r2.R(r4, r5)     // Catch:{ RemoteException -> 0x01c5 }
            int r4 = r2.readInt()     // Catch:{ RemoteException -> 0x01c5 }
            r2.recycle()     // Catch:{ RemoteException -> 0x01c5 }
            if (r6 == r4) goto L_0x0225
            goto L_0x01cc
        L_0x01c5:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x01cc:
            bkg r2 = r7.o
            r2.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            int r3 = defpackage.z53.S(r0, r3)
            r4.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x01de:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x01f7
            java.lang.Object r3 = r0.next()
            er7 r3 = (defpackage.er7) r3
            com.google.android.gms.maps.model.LatLng r5 = new com.google.android.gms.maps.model.LatLng
            double r11 = r3.a
            double r13 = r3.b
            r5.<init>(r11, r13)
            r4.add(r5)
            goto L_0x01de
        L_0x01f7:
            java.lang.Object r0 = r2.b
            h5b r0 = (defpackage.h5b) r0
            r0.getClass()
            qfg r0 = r0.a     // Catch:{ RemoteException -> 0x026d }
            ofg r0 = (defpackage.ofg) r0     // Catch:{ RemoteException -> 0x026d }
            android.os.Parcel r2 = r0.G0()     // Catch:{ RemoteException -> 0x026d }
            r2.writeTypedList(r4)     // Catch:{ RemoteException -> 0x026d }
            r3 = 3
            r0.H0(r2, r3)     // Catch:{ RemoteException -> 0x026d }
            bkg r0 = r7.o
            java.lang.Object r0 = r0.b
            h5b r0 = (defpackage.h5b) r0
            r0.getClass()
            qfg r0 = r0.a     // Catch:{ RemoteException -> 0x0266 }
            ofg r0 = (defpackage.ofg) r0     // Catch:{ RemoteException -> 0x0266 }
            android.os.Parcel r2 = r0.G0()     // Catch:{ RemoteException -> 0x0266 }
            r2.writeInt(r6)     // Catch:{ RemoteException -> 0x0266 }
            r3 = 7
            r0.H0(r2, r3)     // Catch:{ RemoteException -> 0x0266 }
        L_0x0225:
            iq1 r0 = r7.p
            defpackage.cqc.b(r0)
            vy7 r2 = r7.e
            monitor-enter(r2)
            d74 r0 = new d74     // Catch:{ all -> 0x0263 }
            r3 = 22
            r5 = r16
            r0.<init>(r2, r3, r5)     // Catch:{ all -> 0x0263 }
            q1a r3 = new q1a     // Catch:{ all -> 0x0263 }
            r4 = 1
            r3.<init>(r4, r0)     // Catch:{ all -> 0x0263 }
            monitor-exit(r2)
            ztc r0 = r7.f
            drd r0 = r3.m(r0)
            ztc r2 = defpackage.ce.a()
            drd r0 = r0.i(r2)
            vi0 r2 = new vi0
            r2.<init>((defpackage.qy7) r7, (boolean) r1, (long) r9)
            xw0 r1 = new xw0
            r3 = 28
            r1.<init>(r3)
            iq1 r3 = new iq1
            r4 = 2
            r3.<init>(r2, r4, r1)
            r0.k(r3)
            r7.p = r3
            return
        L_0x0263:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0263 }
            throw r0
        L_0x0266:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x026d:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x0274:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el9.C(java.util.List, boolean):void");
    }

    public final double[] D() {
        qy7 qy7 = this.K0;
        if (qy7 == null) {
            return new double[]{1.401298464324817E-45d, 1.401298464324817E-45d};
        }
        LatLng latLng = ((CameraPosition) qy7.d.X().b).a;
        return new double[]{latLng.a, latLng.b};
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, ny7] */
    public final ny7 E() {
        boolean z;
        boolean z2;
        qy7 qy7 = this.K0;
        u5e u5e = null;
        if (qy7 == null) {
            return null;
        }
        rxd rxd = qy7.d;
        CameraPosition cameraPosition = (CameraPosition) rxd.X().b;
        LatLng latLng = cameraPosition.a;
        double d = latLng.a;
        y7g y7g = (y7g) rxd.b;
        if (y7g.A() != null) {
            u5e = new u5e(y7g.A());
        }
        boolean z3 = true;
        if (u5e != null) {
            wmc wmc = (wmc) u5e.a;
            wmc.getClass();
            mgg mgg = (mgg) wmc.a;
            try {
                Parcel R = mgg.R(mgg.G0(), 9);
                int i = agg.a;
                z = R.readInt() != 0;
                R.recycle();
                try {
                    Parcel R2 = mgg.R(mgg.G0(), 13);
                    z2 = R2.readInt() != 0;
                    R2.recycle();
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (RemoteException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            z2 = false;
            z = false;
        }
        ? obj = new Object();
        obj.a = d;
        obj.b = latLng.b;
        obj.c = z;
        obj.d = z2;
        y7g.getClass();
        try {
            eig eig = (eig) y7g.b;
            Parcel R3 = eig.R(eig.G0(), 21);
            int i2 = agg.a;
            if (R3.readInt() == 0) {
                z3 = false;
            }
            R3.recycle();
            obj.e = z3;
            obj.f = rxd.Y();
            obj.g = cameraPosition.b;
            obj.h = cameraPosition.c;
            obj.i = cameraPosition.o;
            return new ny7(obj);
        } catch (RemoteException e3) {
            throw new RuntimeException(e3);
        }
    }

    public final void F() {
        ValueAnimator valueAnimator = this.N0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, (float) (-this.M0.n)});
        this.N0 = ofFloat;
        tg tgVar = this.v0;
        ofFloat.setInterpolator(tgVar.a.n());
        this.N0.setDuration(tgVar.a.b());
        this.N0.setRepeatMode(2);
        this.N0.setRepeatCount(1);
        this.N0.addUpdateListener(new z00(2, (Object) this));
        this.N0.start();
    }

    public final void c() {
        View view = (View) this.c;
        if (view != null) {
            fka j = qp4.u0.j(view);
            ((View) this.c).setBackgroundColor(j.b().g);
            this.C0.setImageTintList(ColorStateList.valueOf(j.getIcon().k));
        }
    }

    /* JADX WARNING: type inference failed for: r0v35, types: [cu3, de7, java.lang.Object] */
    public final void m() {
        ViewGroup viewGroup = (ViewGroup) ((View) this.c);
        cla cla = new cla(viewGroup.getContext(), 4);
        cla.setId(xxb.frg_location_map__toolbar);
        cla.setLayoutParams(new ti3(-1, -2));
        ti3 ti3 = (ti3) cla.getLayoutParams();
        ti3.i = 0;
        ti3.t = 0;
        ti3.v = 0;
        cla.setLayoutParams(ti3);
        viewGroup.addView(cla);
        ((View) this.c).getContext();
        this.M0 = bk4.b();
        cla cla2 = (cla) ((View) this.c).findViewById(xxb.frg_location_map__toolbar);
        cla2.setTitle(jpc.V2);
        cla2.setForm(uka.a);
        cla2.setLeftActions(new lka(new l(14, this)));
        this.B0 = (TamSupportMapFragment) this.t0.D(xxb.frg_location_map__map);
        this.C0 = (AppCompatImageView) ((View) this.c).findViewById(xxb.frg_location_map__marker_head);
        this.D0 = (Group) ((View) this.c).findViewById(xxb.frg_location_map__marker_group);
        OneMeButton oneMeButton = (OneMeButton) ((View) this.c).findViewById(xxb.frg_location_map__current_location_fab);
        this.E0 = oneMeButton;
        c7a c7a = c7a.c;
        oneMeButton.setSize(c7a);
        OneMeButton oneMeButton2 = this.E0;
        b7a b7a = b7a.a;
        oneMeButton2.setMode(b7a);
        OneMeButton oneMeButton3 = this.E0;
        z6a z6a = z6a.a;
        oneMeButton3.setAppearance(z6a);
        this.E0.d(Integer.valueOf(woc.q0), true);
        OneMeButton oneMeButton4 = (OneMeButton) ((View) this.c).findViewById(xxb.frg_location_map__layer_fab);
        this.F0 = oneMeButton4;
        oneMeButton4.setSize(c7a);
        this.F0.setMode(b7a);
        this.F0.setAppearance(z6a);
        this.F0.d(Integer.valueOf(gpc.G), true);
        hj0 hj0 = new hj0(this, 0);
        hj0 hj02 = new hj0(this, 1);
        hj0 hj03 = new hj0(this, 2);
        int G = tu0.G(((float) 240) * fk4.d().getDisplayMetrics().density);
        Context context = (Context) this.b;
        ? cu3 = new cu3(context, G);
        cu3.d = false;
        cu3.a.a(y53.M(new st3(new eqe(jpc.v0), (Integer) null, hj0, 14), new st3(new eqe(jpc.w0), (Integer) null, hj02, 14), new st3(new eqe(jpc.u0), (Integer) null, hj03, 14)), new bk(7, cu3));
        this.G0 = cu3;
        c08 c08 = new c08(this.u0, 0);
        m7b m7b = this.w0;
        ri4 ri4 = this.y0;
        this.H0 = new mj9(new pk9((Context) this.b, this.X, this.Y, m7b, ri4, (ViewStub) ((View) this.c).findViewById(xxb.frg_location_map__contact_location)), c08, this);
        this.I0 = (ViewStub) ((View) this.c).findViewById(xxb.frg_location_map__send_location);
        this.J0 = new il9(context, this.z0);
        this.B0.n1.setListener(this);
        nd7.h(this.F0, new ij0(this, 0));
        nd7.h(this.E0, new ij0(this, 1));
        this.A0.getClass();
    }
}
