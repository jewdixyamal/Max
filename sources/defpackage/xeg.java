package defpackage;

/* renamed from: xeg  reason: default package */
public final class xeg extends idg {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Object e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xeg(z16 z16) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 1);
        this.e = z16;
    }

    /* JADX WARNING: type inference failed for: r11v14, types: [cdg] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean H0(int r24, android.os.Parcel r25, android.os.Parcel r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = 18
            r3 = 17
            r4 = 20
            r5 = 3
            java.lang.Object r6 = r0.e
            r8 = 0
            r9 = 1
            int r0 = r0.d
            switch(r0) {
                case 0: goto L_0x0283;
                case 1: goto L_0x005f;
                default: goto L_0x0014;
            }
        L_0x0014:
            if (r1 != r9) goto L_0x005e
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLng> r0 = com.google.android.gms.maps.model.LatLng.CREATOR
            int r1 = defpackage.agg.a
            int r1 = r25.readInt()
            if (r1 != 0) goto L_0x0024
            r10 = r25
            r7 = 0
            goto L_0x002d
        L_0x0024:
            r10 = r25
            java.lang.Object r0 = r0.createFromParcel(r10)
            r7 = r0
            android.os.Parcelable r7 = (android.os.Parcelable) r7
        L_0x002d:
            com.google.android.gms.maps.model.LatLng r7 = (com.google.android.gms.maps.model.LatLng) r7
            defpackage.agg.a(r25)
            z16 r6 = (defpackage.z16) r6
            java.lang.Object r0 = r6.b
            ti0 r0 = (defpackage.ti0) r0
            qy7 r1 = r0.a
            r1.getClass()
            el9 r0 = r0.b
            r0.getClass()
            java.lang.Object r0 = r0.a
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x004a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005a
            java.lang.Object r1 = r0.next()
            fk9 r1 = (defpackage.fk9) r1
            r1.getClass()
            goto L_0x004a
        L_0x005a:
            r26.writeNoException()
            r8 = r9
        L_0x005e:
            return r8
        L_0x005f:
            r10 = r25
            if (r1 != r9) goto L_0x0282
            android.os.IBinder r0 = r25.readStrongBinder()
            if (r0 != 0) goto L_0x006b
            r11 = 0
            goto L_0x007d
        L_0x006b:
            java.lang.String r1 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
            android.os.IInterface r11 = r0.queryLocalInterface(r1)
            boolean r12 = r11 instanceof defpackage.eig
            if (r12 == 0) goto L_0x0078
            eig r11 = (defpackage.eig) r11
            goto L_0x007d
        L_0x0078:
            eig r11 = new eig
            r11.<init>(r0, r1, r5)
        L_0x007d:
            defpackage.agg.a(r25)
            y7g r0 = new y7g
            r0.<init>((defpackage.eig) r11)
            rde r6 = (defpackage.rde) r6
            r6.getClass()
            java.lang.Object r1 = r0.b     // Catch:{ RemoteException -> 0x027b }
            eig r1 = (defpackage.eig) r1     // Catch:{ RemoteException -> 0x027b }
            android.os.Parcel r10 = r1.G0()     // Catch:{ RemoteException -> 0x027b }
            r10.writeInt(r8)     // Catch:{ RemoteException -> 0x027b }
            r10.writeInt(r8)     // Catch:{ RemoteException -> 0x027b }
            r10.writeInt(r8)     // Catch:{ RemoteException -> 0x027b }
            r10.writeInt(r8)     // Catch:{ RemoteException -> 0x027b }
            r11 = 39
            r1.H0(r10, r11)     // Catch:{ RemoteException -> 0x027b }
            rxd r13 = new rxd
            r13.<init>(r4, r0)
            qy7 r0 = new qy7
            o84 r1 = new o84
            r10 = 8
            r1.<init>((int) r10)
            qx7 r10 = new qx7
            r11 = 7
            r10.<init>(r11)
            c32 r11 = new c32
            r12 = 13
            r11.<init>(r12, r8)
            kp7 r15 = new kp7
            r12 = 14
            r15.<init>(r12)
            kp7 r14 = new kp7
            r12 = 15
            r14.<init>(r12)
            kp7 r12 = new kp7
            r7 = 16
            r12.<init>(r7)
            kp7 r7 = new kp7
            r7.<init>(r3)
            vy7 r3 = r6.a
            ztc r5 = r6.b
            r21 = r12
            r12 = r0
            r20 = r14
            r14 = r3
            r3 = r15
            r15 = r5
            r16 = r1
            r17 = r10
            r18 = r11
            r19 = r3
            r22 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            el9 r1 = r6.c
            r1.K0 = r0
            ny7 r3 = r1.L0
            boolean r5 = r3.c
            boolean r6 = r3.d
            boolean r7 = r3.e
            java.lang.Object r10 = r1.b
            android.content.Context r10 = (android.content.Context) r10
            r0.g(r10, r7)
            rxd r7 = r0.d
            java.lang.Object r11 = r7.b
            y7g r11 = (defpackage.y7g) r11
            wmc r12 = r11.A()
            if (r12 != 0) goto L_0x0112
            r12 = 0
            goto L_0x011b
        L_0x0112:
            u5e r12 = new u5e
            wmc r11 = r11.A()
            r12.<init>(r11)
        L_0x011b:
            if (r12 != 0) goto L_0x011e
            goto L_0x015d
        L_0x011e:
            java.lang.Object r11 = r12.a
            wmc r11 = (defpackage.wmc) r11
            r11.getClass()
            java.lang.Object r11 = r11.a
            mgg r11 = (defpackage.mgg) r11
            android.os.Parcel r12 = r11.G0()     // Catch:{ RemoteException -> 0x0274 }
            r12.writeInt(r5)     // Catch:{ RemoteException -> 0x0274 }
            r11.H0(r12, r9)     // Catch:{ RemoteException -> 0x0274 }
            android.os.Parcel r5 = r11.G0()     // Catch:{ RemoteException -> 0x026d }
            r5.writeInt(r6)     // Catch:{ RemoteException -> 0x026d }
            r12 = 5
            r11.H0(r5, r12)     // Catch:{ RemoteException -> 0x026d }
            android.os.Parcel r5 = r11.G0()     // Catch:{ RemoteException -> 0x0266 }
            r5.writeInt(r6)     // Catch:{ RemoteException -> 0x0266 }
            r11.H0(r5, r4)     // Catch:{ RemoteException -> 0x0266 }
            android.os.Parcel r4 = r11.G0()     // Catch:{ RemoteException -> 0x025f }
            r4.writeInt(r8)     // Catch:{ RemoteException -> 0x025f }
            r11.H0(r4, r2)     // Catch:{ RemoteException -> 0x025f }
            android.os.Parcel r4 = r11.G0()     // Catch:{ RemoteException -> 0x0258 }
            r4.writeInt(r8)     // Catch:{ RemoteException -> 0x0258 }
            r5 = 3
            r11.H0(r4, r5)     // Catch:{ RemoteException -> 0x0258 }
        L_0x015d:
            int r4 = r3.f
            r0.f(r4)
            double r4 = r3.a
            r11 = 3936146074321813504(0x36a0000000000000, double:1.401298464324817E-45)
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x018a
            double r13 = r3.b
            int r6 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x018a
            float r6 = r3.g
            java.lang.Float r19 = java.lang.Float.valueOf(r6)
            float r6 = r3.h
            java.lang.Float r20 = java.lang.Float.valueOf(r6)
            float r3 = r3.i
            java.lang.Float r21 = java.lang.Float.valueOf(r3)
            r11 = r13
            r14 = r0
            r15 = r4
            r17 = r11
            r14.d(r15, r17, r19, r20, r21)
        L_0x018a:
            ti0 r3 = new ti0
            r3.<init>(r0, r1)
            z16 r4 = new z16
            r4.<init>(r2, r3)
            java.lang.Object r2 = r7.b
            y7g r2 = (defpackage.y7g) r2
            r2.H(r4)
            ti0 r3 = new ti0
            r3.<init>(r0, r1)
            z16 r0 = new z16
            r4 = 17
            r0.<init>(r4, r3)
            r2.I(r0)
            pq9 r0 = defpackage.qp4.u0
            qp4 r0 = r0.b(r10)
            fka r0 = r0.i()
            l63 r0 = r0.h()
            l63 r2 = defpackage.l63.b
            if (r0 != r2) goto L_0x0215
            qy7 r0 = r1.K0
            int r2 = defpackage.tzb.google_map_night_style
            if (r2 != 0) goto L_0x01c6
            r0.getClass()
            goto L_0x0226
        L_0x01c6:
            java.util.HashMap r3 = r0.c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r3.get(r4)
            xy7 r3 = (defpackage.xy7) r3
            if (r3 == 0) goto L_0x01e0
            rxd r0 = r0.d
            java.lang.Object r0 = r0.b
            y7g r0 = (defpackage.y7g) r0
            wy7 r2 = r3.a
            r0.G(r2)
            goto L_0x0226
        L_0x01e0:
            iq1 r3 = r0.n
            defpackage.cqc.b(r3)
            ui0 r3 = new ui0
            r3.<init>((java.lang.Object) r0, (java.lang.Object) r10, (int) r2, (int) r8)
            q1a r4 = new q1a
            r4.<init>(r9, r3)
            ztc r3 = r0.f
            drd r3 = r4.m(r3)
            ztc r4 = defpackage.ce.a()
            drd r3 = r3.i(r4)
            hd0 r4 = new hd0
            r4.<init>(r2, r9, r0)
            xw0 r2 = new xw0
            r5 = 27
            r2.<init>(r5)
            iq1 r5 = new iq1
            r6 = 2
            r5.<init>(r4, r6, r2)
            r3.k(r5)
            r0.n = r5
            goto L_0x0226
        L_0x0215:
            qy7 r0 = r1.K0
            iq1 r2 = r0.n
            defpackage.cqc.b(r2)
            rxd r0 = r0.d
            java.lang.Object r0 = r0.b
            y7g r0 = (defpackage.y7g) r0
            r2 = 0
            r0.G(r2)
        L_0x0226:
            java.lang.Object r0 = r1.a
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x022e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0253
            java.lang.Object r1 = r0.next()
            fk9 r1 = (defpackage.fk9) r1
            r1.e2()
            r1.d2()
            ir7 r2 = r1.C0
            long r2 = r2.h
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x024d
            r1.g2(r2)
        L_0x024d:
            nr7 r2 = r1.Y
            r2.a(r1)
            goto L_0x022e
        L_0x0253:
            r26.writeNoException()
            r8 = r9
            goto L_0x0282
        L_0x0258:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x025f:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
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
        L_0x027b:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x0282:
            return r8
        L_0x0283:
            r10 = r25
            r2 = 0
            if (r1 != r9) goto L_0x031e
            android.os.IBinder r0 = r25.readStrongBinder()
            if (r0 != 0) goto L_0x0290
            r7 = r2
            goto L_0x02a4
        L_0x0290:
            java.lang.String r1 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
            android.os.IInterface r2 = r0.queryLocalInterface(r1)
            boolean r3 = r2 instanceof defpackage.lfg
            if (r3 == 0) goto L_0x029e
            r7 = r2
            lfg r7 = (defpackage.lfg) r7
            goto L_0x02a4
        L_0x029e:
            jfg r7 = new jfg
            r2 = 3
            r7.<init>(r0, r1, r2)
        L_0x02a4:
            defpackage.agg.a(r25)
            defpackage.fp3.n(r7)
            z16 r6 = (defpackage.z16) r6
            java.lang.Object r0 = r6.b
            ti0 r0 = (defpackage.ti0) r0
            qy7 r1 = r0.a
            r1.getClass()
            jfg r7 = (defpackage.jfg) r7     // Catch:{ RemoteException -> 0x0317 }
            android.os.Parcel r2 = r7.G0()     // Catch:{ RemoteException -> 0x0317 }
            r3 = 30
            android.os.Parcel r2 = r7.R(r2, r3)     // Catch:{ RemoteException -> 0x0317 }
            android.os.IBinder r3 = r2.readStrongBinder()     // Catch:{ RemoteException -> 0x0317 }
            xr6 r3 = defpackage.oy9.K0(r3)     // Catch:{ RemoteException -> 0x0317 }
            r2.recycle()     // Catch:{ RemoteException -> 0x0317 }
            java.lang.Object r2 = defpackage.oy9.L0(r3)     // Catch:{ RemoteException -> 0x0317 }
            boolean r3 = r2 instanceof java.lang.Long
            if (r3 != 0) goto L_0x02d5
            goto L_0x030d
        L_0x02d5:
            java.lang.Long r2 = (java.lang.Long) r2
            r2.getClass()
            java.util.LinkedHashMap r3 = r1.a
            java.lang.Object r3 = r3.get(r2)
            xi0 r3 = (defpackage.xi0) r3
            el9 r0 = r0.b
            if (r3 == 0) goto L_0x02f5
            e08 r1 = r3.b
            r0.getClass()
            gj0 r2 = new gj0
            r2.<init>(r1, r8)
            r0.n(r2)
        L_0x02f3:
            r8 = r9
            goto L_0x030d
        L_0x02f5:
            java.util.LinkedHashMap r1 = r1.b
            java.lang.Object r1 = r1.get(r2)
            xi0 r1 = (defpackage.xi0) r1
            if (r1 == 0) goto L_0x030d
            e08 r1 = r1.b
            r0.getClass()
            gj0 r2 = new gj0
            r2.<init>(r1, r9)
            r0.n(r2)
            goto L_0x02f3
        L_0x030d:
            r26.writeNoException()
            r0 = r26
            r0.writeInt(r8)
            r8 = r9
            goto L_0x031e
        L_0x0317:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x031e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xeg.H0(int, android.os.Parcel, android.os.Parcel):boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xeg(z16 z16, byte b) {
        super("com.google.android.gms.maps.internal.IOnMapClickListener", 1);
        this.e = z16;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xeg(rde rde) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 1);
        this.e = rde;
    }
}
