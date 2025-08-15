package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ufg  reason: default package */
public final class ufg implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ ufg(int i) {
        this.a = i;
    }

    public static void a(qc6 qc6, Parcel parcel, int i) {
        int T = ay7.T(parcel, 20293);
        int i2 = qc6.a;
        ay7.X(parcel, 1, 4);
        parcel.writeInt(i2);
        ay7.X(parcel, 2, 4);
        parcel.writeInt(qc6.b);
        ay7.X(parcel, 3, 4);
        parcel.writeInt(qc6.c);
        ay7.Q(parcel, 4, qc6.o);
        ay7.O(parcel, 5, qc6.X);
        ay7.R(parcel, 6, qc6.Y, i);
        ay7.M(parcel, 7, qc6.Z);
        ay7.P(parcel, 8, qc6.s0, i);
        ay7.R(parcel, 10, qc6.t0, i);
        ay7.R(parcel, 11, qc6.u0, i);
        ay7.X(parcel, 12, 4);
        parcel.writeInt(qc6.v0 ? 1 : 0);
        ay7.X(parcel, 13, 4);
        parcel.writeInt(qc6.w0);
        boolean z = qc6.x0;
        ay7.X(parcel, 14, 4);
        parcel.writeInt(z ? 1 : 0);
        ay7.Q(parcel, 15, qc6.y0);
        ay7.W(parcel, T);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v73, resolved type: android.view.View} */
    /* JADX WARNING: type inference failed for: r0v8, types: [w13, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, com.google.android.gms.auth.api.signin.SignInAccount] */
    /* JADX WARNING: type inference failed for: r2v31, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v46, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v47, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v51, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r0v24, types: [vig, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v51, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v72, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v73, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v74, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v75, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r0v38, types: [java.lang.Object, g08] */
    /* JADX WARNING: type inference failed for: r2v92, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v100, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v101, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            int r0 = r0.a
            switch(r0) {
                case 0: goto L_0x071e;
                case 1: goto L_0x06d5;
                case 2: goto L_0x06cb;
                case 3: goto L_0x0655;
                case 4: goto L_0x061d;
                case 5: goto L_0x05cf;
                case 6: goto L_0x05a1;
                case 7: goto L_0x0550;
                case 8: goto L_0x04e0;
                case 9: goto L_0x048a;
                case 10: goto L_0x042d;
                case 11: goto L_0x03dc;
                case 12: goto L_0x0371;
                case 13: goto L_0x0348;
                case 14: goto L_0x0312;
                case 15: goto L_0x0277;
                case 16: goto L_0x0240;
                case 17: goto L_0x021b;
                case 18: goto L_0x010b;
                case 19: goto L_0x00dd;
                case 20: goto L_0x0060;
                case 21: goto L_0x003b;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r0 = defpackage.br7.d0(r28)
            r2 = 0
            r3 = r2
        L_0x000f:
            int r4 = r28.dataPosition()
            if (r4 >= r0) goto L_0x0032
            int r4 = r28.readInt()
            char r5 = (char) r4
            r6 = 2
            if (r5 == r6) goto L_0x002d
            r6 = 5
            if (r5 == r6) goto L_0x0024
            defpackage.br7.X(r1, r4)
            goto L_0x000f
        L_0x0024:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.signin.GoogleSignInOptions> r3 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.CREATOR
            android.os.Parcelable r3 = defpackage.br7.o(r1, r4, r3)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r3 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r3
            goto L_0x000f
        L_0x002d:
            java.lang.String r2 = defpackage.br7.p(r1, r4)
            goto L_0x000f
        L_0x0032:
            defpackage.br7.s(r1, r0)
            com.google.android.gms.auth.api.signin.internal.SignInConfiguration r0 = new com.google.android.gms.auth.api.signin.internal.SignInConfiguration
            r0.<init>(r2, r3)
            return r0
        L_0x003b:
            int r0 = defpackage.br7.d0(r28)
            r2 = 0
        L_0x0040:
            int r3 = r28.dataPosition()
            if (r3 >= r0) goto L_0x0057
            int r3 = r28.readInt()
            char r4 = (char) r3
            r5 = 2
            if (r4 == r5) goto L_0x0052
            defpackage.br7.X(r1, r3)
            goto L_0x0040
        L_0x0052:
            android.os.IBinder r2 = defpackage.br7.T(r1, r3)
            goto L_0x0040
        L_0x0057:
            defpackage.br7.s(r1, r0)
            txd r0 = new txd
            r0.<init>(r2)
            return r0
        L_0x0060:
            int r0 = defpackage.br7.d0(r28)
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = r2
            r13 = r6
            r14 = r13
            r16 = r14
            r17 = r16
            r8 = r3
            r10 = r8
            r11 = r10
            r12 = r11
            r15 = r12
            r7 = r4
            r9 = r7
        L_0x0075:
            int r2 = r28.dataPosition()
            if (r2 >= r0) goto L_0x00d3
            int r2 = r28.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 2: goto L_0x00cc;
                case 3: goto L_0x00c7;
                case 4: goto L_0x00c2;
                case 5: goto L_0x00bd;
                case 6: goto L_0x00b8;
                case 7: goto L_0x00b3;
                case 8: goto L_0x00ae;
                case 9: goto L_0x00a4;
                case 10: goto L_0x009a;
                case 11: goto L_0x0095;
                case 12: goto L_0x008e;
                case 13: goto L_0x0087;
                default: goto L_0x0083;
            }
        L_0x0083:
            defpackage.br7.X(r1, r2)
            goto L_0x0075
        L_0x0087:
            android.os.Parcelable$Creator<pae> r3 = defpackage.pae.CREATOR
            java.util.ArrayList r17 = defpackage.br7.r(r1, r2, r3)
            goto L_0x0075
        L_0x008e:
            android.os.Parcelable$Creator<tra> r3 = defpackage.tra.CREATOR
            java.util.ArrayList r16 = defpackage.br7.r(r1, r2, r3)
            goto L_0x0075
        L_0x0095:
            int r15 = defpackage.br7.U(r1, r2)
            goto L_0x0075
        L_0x009a:
            android.os.Parcelable$Creator<ez1> r3 = defpackage.ez1.CREATOR
            android.os.Parcelable r2 = defpackage.br7.o(r1, r2, r3)
            r14 = r2
            ez1 r14 = (defpackage.ez1) r14
            goto L_0x0075
        L_0x00a4:
            android.os.Parcelable$Creator<ez1> r3 = defpackage.ez1.CREATOR
            android.os.Parcelable r2 = defpackage.br7.o(r1, r2, r3)
            r13 = r2
            ez1 r13 = (defpackage.ez1) r13
            goto L_0x0075
        L_0x00ae:
            boolean r12 = defpackage.br7.O(r1, r2)
            goto L_0x0075
        L_0x00b3:
            boolean r11 = defpackage.br7.O(r1, r2)
            goto L_0x0075
        L_0x00b8:
            boolean r10 = defpackage.br7.O(r1, r2)
            goto L_0x0075
        L_0x00bd:
            float r9 = defpackage.br7.R(r1, r2)
            goto L_0x0075
        L_0x00c2:
            int r8 = defpackage.br7.U(r1, r2)
            goto L_0x0075
        L_0x00c7:
            float r7 = defpackage.br7.R(r1, r2)
            goto L_0x0075
        L_0x00cc:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLng> r3 = com.google.android.gms.maps.model.LatLng.CREATOR
            java.util.ArrayList r6 = defpackage.br7.r(r1, r2, r3)
            goto L_0x0075
        L_0x00d3:
            defpackage.br7.s(r1, r0)
            i5b r0 = new i5b
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        L_0x00dd:
            int r0 = defpackage.br7.d0(r28)
            r2 = 0
            r3 = 0
        L_0x00e3:
            int r4 = r28.dataPosition()
            if (r4 >= r0) goto L_0x0102
            int r4 = r28.readInt()
            char r5 = (char) r4
            r6 = 2
            if (r5 == r6) goto L_0x00fd
            r6 = 3
            if (r5 == r6) goto L_0x00f8
            defpackage.br7.X(r1, r4)
            goto L_0x00e3
        L_0x00f8:
            java.lang.Float r2 = defpackage.br7.S(r1, r4)
            goto L_0x00e3
        L_0x00fd:
            int r3 = defpackage.br7.U(r1, r4)
            goto L_0x00e3
        L_0x0102:
            defpackage.br7.s(r1, r0)
            tra r0 = new tra
            r0.<init>(r3, r2)
            return r0
        L_0x010b:
            int r0 = defpackage.br7.d0(r28)
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1056964608(0x3f000000, float:0.5)
            r13 = r4
            r14 = r13
            r15 = r14
            r23 = r15
            r24 = r23
            r21 = r5
            r19 = r6
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r25 = 0
            r26 = 0
        L_0x0131:
            int r3 = r28.dataPosition()
            if (r3 >= r0) goto L_0x01a7
            int r3 = r28.readInt()
            char r2 = (char) r3
            switch(r2) {
                case 2: goto L_0x019d;
                case 3: goto L_0x0198;
                case 4: goto L_0x0193;
                case 5: goto L_0x018e;
                case 6: goto L_0x0189;
                case 7: goto L_0x0184;
                case 8: goto L_0x017f;
                case 9: goto L_0x017a;
                case 10: goto L_0x0175;
                case 11: goto L_0x0170;
                case 12: goto L_0x016b;
                case 13: goto L_0x0166;
                case 14: goto L_0x0161;
                case 15: goto L_0x015c;
                case 16: goto L_0x013f;
                case 17: goto L_0x0157;
                case 18: goto L_0x0152;
                case 19: goto L_0x014d;
                case 20: goto L_0x0148;
                case 21: goto L_0x0143;
                default: goto L_0x013f;
            }
        L_0x013f:
            defpackage.br7.X(r1, r3)
            goto L_0x0131
        L_0x0143:
            float r26 = defpackage.br7.R(r1, r3)
            goto L_0x0131
        L_0x0148:
            java.lang.String r25 = defpackage.br7.p(r1, r3)
            goto L_0x0131
        L_0x014d:
            int r24 = defpackage.br7.U(r1, r3)
            goto L_0x0131
        L_0x0152:
            android.os.IBinder r16 = defpackage.br7.T(r1, r3)
            goto L_0x0131
        L_0x0157:
            int r23 = defpackage.br7.U(r1, r3)
            goto L_0x0131
        L_0x015c:
            float r22 = defpackage.br7.R(r1, r3)
            goto L_0x0131
        L_0x0161:
            float r21 = defpackage.br7.R(r1, r3)
            goto L_0x0131
        L_0x0166:
            float r20 = defpackage.br7.R(r1, r3)
            goto L_0x0131
        L_0x016b:
            float r19 = defpackage.br7.R(r1, r3)
            goto L_0x0131
        L_0x0170:
            float r18 = defpackage.br7.R(r1, r3)
            goto L_0x0131
        L_0x0175:
            boolean r15 = defpackage.br7.O(r1, r3)
            goto L_0x0131
        L_0x017a:
            boolean r14 = defpackage.br7.O(r1, r3)
            goto L_0x0131
        L_0x017f:
            boolean r13 = defpackage.br7.O(r1, r3)
            goto L_0x0131
        L_0x0184:
            float r12 = defpackage.br7.R(r1, r3)
            goto L_0x0131
        L_0x0189:
            float r11 = defpackage.br7.R(r1, r3)
            goto L_0x0131
        L_0x018e:
            android.os.IBinder r10 = defpackage.br7.T(r1, r3)
            goto L_0x0131
        L_0x0193:
            java.lang.String r9 = defpackage.br7.p(r1, r3)
            goto L_0x0131
        L_0x0198:
            java.lang.String r8 = defpackage.br7.p(r1, r3)
            goto L_0x0131
        L_0x019d:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLng> r2 = com.google.android.gms.maps.model.LatLng.CREATOR
            android.os.Parcelable r2 = defpackage.br7.o(r1, r3, r2)
            r7 = r2
            com.google.android.gms.maps.model.LatLng r7 = (com.google.android.gms.maps.model.LatLng) r7
            goto L_0x0131
        L_0x01a7:
            defpackage.br7.s(r1, r0)
            g08 r0 = new g08
            r0.<init>()
            r0.X = r6
            r0.Y = r5
            r1 = 1
            r0.s0 = r1
            r0.t0 = r4
            r1 = 0
            r0.u0 = r1
            r0.v0 = r6
            r0.w0 = r1
            r0.x0 = r5
            r0.z0 = r4
            r0.a = r7
            r0.b = r8
            r0.c = r9
            if (r10 != 0) goto L_0x01cf
            r1 = 0
            r0.o = r1
            goto L_0x01db
        L_0x01cf:
            r1 = 0
            rxd r2 = new rxd
            xr6 r3 = defpackage.oy9.K0(r10)
            r2.<init>((defpackage.xr6) r3)
            r0.o = r2
        L_0x01db:
            r0.X = r11
            r0.Y = r12
            r0.Z = r13
            r0.s0 = r14
            r0.t0 = r15
            r2 = r18
            r0.u0 = r2
            r6 = r19
            r0.v0 = r6
            r2 = r20
            r0.w0 = r2
            r5 = r21
            r0.x0 = r5
            r2 = r22
            r0.y0 = r2
            r4 = r24
            r0.B0 = r4
            r4 = r23
            r0.z0 = r4
            xr6 r2 = defpackage.oy9.K0(r16)
            if (r2 != 0) goto L_0x0209
            r3 = r1
            goto L_0x0210
        L_0x0209:
            java.lang.Object r1 = defpackage.oy9.L0(r2)
            r3 = r1
            android.view.View r3 = (android.view.View) r3
        L_0x0210:
            r0.A0 = r3
            r3 = r25
            r0.C0 = r3
            r2 = r26
            r0.D0 = r2
            return r0
        L_0x021b:
            int r0 = defpackage.br7.d0(r28)
            r2 = 0
        L_0x0220:
            int r3 = r28.dataPosition()
            if (r3 >= r0) goto L_0x0237
            int r3 = r28.readInt()
            char r4 = (char) r3
            r5 = 2
            if (r4 == r5) goto L_0x0232
            defpackage.br7.X(r1, r3)
            goto L_0x0220
        L_0x0232:
            java.lang.String r2 = defpackage.br7.p(r1, r3)
            goto L_0x0220
        L_0x0237:
            defpackage.br7.s(r1, r0)
            wy7 r0 = new wy7
            r0.<init>(r2)
            return r0
        L_0x0240:
            int r0 = defpackage.br7.d0(r28)
            r2 = 0
            r4 = r2
        L_0x0247:
            int r6 = r28.dataPosition()
            if (r6 >= r0) goto L_0x026e
            int r6 = r28.readInt()
            char r7 = (char) r6
            r8 = 2
            r9 = 8
            if (r7 == r8) goto L_0x0266
            r8 = 3
            if (r7 == r8) goto L_0x025e
            defpackage.br7.X(r1, r6)
            goto L_0x0247
        L_0x025e:
            defpackage.br7.h0(r1, r6, r9)
            double r4 = r28.readDouble()
            goto L_0x0247
        L_0x0266:
            defpackage.br7.h0(r1, r6, r9)
            double r2 = r28.readDouble()
            goto L_0x0247
        L_0x026e:
            defpackage.br7.s(r1, r0)
            com.google.android.gms.maps.model.LatLng r0 = new com.google.android.gms.maps.model.LatLng
            r0.<init>(r2, r4)
            return r0
        L_0x0277:
            int r0 = defpackage.br7.d0(r28)
            com.google.android.gms.common.api.Scope[] r2 = defpackage.qc6.z0
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            pe5[] r4 = defpackage.qc6.A0
            r5 = 0
            r6 = 0
            r13 = r2
            r14 = r3
            r16 = r4
            r17 = r16
            r11 = r5
            r12 = r11
            r15 = r12
            r21 = r15
            r8 = r6
            r9 = r8
            r10 = r9
            r18 = r10
            r19 = r18
            r20 = r19
        L_0x029a:
            int r2 = r28.dataPosition()
            if (r2 >= r0) goto L_0x0308
            int r2 = r28.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x0303;
                case 2: goto L_0x02fe;
                case 3: goto L_0x02f9;
                case 4: goto L_0x02f4;
                case 5: goto L_0x02ef;
                case 6: goto L_0x02e5;
                case 7: goto L_0x02e0;
                case 8: goto L_0x02d6;
                case 9: goto L_0x02a8;
                case 10: goto L_0x02cb;
                case 11: goto L_0x02c0;
                case 12: goto L_0x02bb;
                case 13: goto L_0x02b6;
                case 14: goto L_0x02b1;
                case 15: goto L_0x02ac;
                default: goto L_0x02a8;
            }
        L_0x02a8:
            defpackage.br7.X(r1, r2)
            goto L_0x029a
        L_0x02ac:
            java.lang.String r21 = defpackage.br7.p(r1, r2)
            goto L_0x029a
        L_0x02b1:
            boolean r20 = defpackage.br7.O(r1, r2)
            goto L_0x029a
        L_0x02b6:
            int r19 = defpackage.br7.U(r1, r2)
            goto L_0x029a
        L_0x02bb:
            boolean r18 = defpackage.br7.O(r1, r2)
            goto L_0x029a
        L_0x02c0:
            android.os.Parcelable$Creator<pe5> r3 = defpackage.pe5.CREATOR
            java.lang.Object[] r2 = defpackage.br7.q(r1, r2, r3)
            r17 = r2
            pe5[] r17 = (defpackage.pe5[]) r17
            goto L_0x029a
        L_0x02cb:
            android.os.Parcelable$Creator<pe5> r3 = defpackage.pe5.CREATOR
            java.lang.Object[] r2 = defpackage.br7.q(r1, r2, r3)
            r16 = r2
            pe5[] r16 = (defpackage.pe5[]) r16
            goto L_0x029a
        L_0x02d6:
            android.os.Parcelable$Creator r3 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = defpackage.br7.o(r1, r2, r3)
            r15 = r2
            android.accounts.Account r15 = (android.accounts.Account) r15
            goto L_0x029a
        L_0x02e0:
            android.os.Bundle r14 = defpackage.br7.n(r1, r2)
            goto L_0x029a
        L_0x02e5:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.lang.Object[] r2 = defpackage.br7.q(r1, r2, r3)
            r13 = r2
            com.google.android.gms.common.api.Scope[] r13 = (com.google.android.gms.common.api.Scope[]) r13
            goto L_0x029a
        L_0x02ef:
            android.os.IBinder r12 = defpackage.br7.T(r1, r2)
            goto L_0x029a
        L_0x02f4:
            java.lang.String r11 = defpackage.br7.p(r1, r2)
            goto L_0x029a
        L_0x02f9:
            int r10 = defpackage.br7.U(r1, r2)
            goto L_0x029a
        L_0x02fe:
            int r9 = defpackage.br7.U(r1, r2)
            goto L_0x029a
        L_0x0303:
            int r8 = defpackage.br7.U(r1, r2)
            goto L_0x029a
        L_0x0308:
            defpackage.br7.s(r1, r0)
            qc6 r0 = new qc6
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        L_0x0312:
            int r0 = defpackage.br7.d0(r28)
            r2 = 0
            r3 = r2
        L_0x0318:
            int r4 = r28.dataPosition()
            if (r4 >= r0) goto L_0x033f
            int r4 = r28.readInt()
            char r5 = (char) r4
            r6 = 2
            if (r5 == r6) goto L_0x0336
            r6 = 3
            if (r5 == r6) goto L_0x032d
            defpackage.br7.X(r1, r4)
            goto L_0x0318
        L_0x032d:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLng> r3 = com.google.android.gms.maps.model.LatLng.CREATOR
            android.os.Parcelable r3 = defpackage.br7.o(r1, r4, r3)
            com.google.android.gms.maps.model.LatLng r3 = (com.google.android.gms.maps.model.LatLng) r3
            goto L_0x0318
        L_0x0336:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLng> r2 = com.google.android.gms.maps.model.LatLng.CREATOR
            android.os.Parcelable r2 = defpackage.br7.o(r1, r4, r2)
            com.google.android.gms.maps.model.LatLng r2 = (com.google.android.gms.maps.model.LatLng) r2
            goto L_0x0318
        L_0x033f:
            defpackage.br7.s(r1, r0)
            com.google.android.gms.maps.model.LatLngBounds r0 = new com.google.android.gms.maps.model.LatLngBounds
            r0.<init>(r2, r3)
            return r0
        L_0x0348:
            int r0 = defpackage.br7.d0(r28)
            r2 = 0
        L_0x034d:
            int r3 = r28.dataPosition()
            if (r3 >= r0) goto L_0x0368
            int r3 = r28.readInt()
            char r4 = (char) r3
            r5 = 1
            if (r4 == r5) goto L_0x035f
            defpackage.br7.X(r1, r3)
            goto L_0x034d
        L_0x035f:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r2 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r2 = defpackage.br7.o(r1, r3, r2)
            com.google.android.gms.common.api.Status r2 = (com.google.android.gms.common.api.Status) r2
            goto L_0x034d
        L_0x0368:
            defpackage.br7.s(r1, r0)
            ejg r0 = new ejg
            r0.<init>(r2)
            return r0
        L_0x0371:
            int r0 = defpackage.br7.d0(r28)
            r2 = 0
            r3 = 0
            r5 = r2
            r8 = r5
            r10 = r8
            r6 = r3
            r7 = r6
            r9 = r7
        L_0x037d:
            int r3 = r28.dataPosition()
            if (r3 >= r0) goto L_0x03d2
            int r3 = r28.readInt()
            char r4 = (char) r3
            switch(r4) {
                case 1: goto L_0x03c8;
                case 2: goto L_0x03c3;
                case 3: goto L_0x03be;
                case 4: goto L_0x03a9;
                case 5: goto L_0x03a4;
                case 6: goto L_0x038f;
                default: goto L_0x038b;
            }
        L_0x038b:
            defpackage.br7.X(r1, r3)
            goto L_0x037d
        L_0x038f:
            int r3 = defpackage.br7.W(r1, r3)
            int r4 = r28.dataPosition()
            if (r3 != 0) goto L_0x039b
            r10 = r2
            goto L_0x037d
        L_0x039b:
            int[] r10 = r28.createIntArray()
            int r4 = r4 + r3
            r1.setDataPosition(r4)
            goto L_0x037d
        L_0x03a4:
            int r9 = defpackage.br7.U(r1, r3)
            goto L_0x037d
        L_0x03a9:
            int r3 = defpackage.br7.W(r1, r3)
            int r4 = r28.dataPosition()
            if (r3 != 0) goto L_0x03b5
            r8 = r2
            goto L_0x037d
        L_0x03b5:
            int[] r8 = r28.createIntArray()
            int r4 = r4 + r3
            r1.setDataPosition(r4)
            goto L_0x037d
        L_0x03be:
            boolean r7 = defpackage.br7.O(r1, r3)
            goto L_0x037d
        L_0x03c3:
            boolean r6 = defpackage.br7.O(r1, r3)
            goto L_0x037d
        L_0x03c8:
            android.os.Parcelable$Creator<xmc> r4 = defpackage.xmc.CREATOR
            android.os.Parcelable r3 = defpackage.br7.o(r1, r3, r4)
            r5 = r3
            xmc r5 = (defpackage.xmc) r5
            goto L_0x037d
        L_0x03d2:
            defpackage.br7.s(r1, r0)
            wh3 r0 = new wh3
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r0
        L_0x03dc:
            int r0 = defpackage.br7.d0(r28)
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r3
            r3 = r4
        L_0x03e5:
            int r6 = r28.dataPosition()
            if (r6 >= r0) goto L_0x041c
            int r6 = r28.readInt()
            char r7 = (char) r6
            r8 = 1
            if (r7 == r8) goto L_0x0417
            r8 = 2
            if (r7 == r8) goto L_0x040e
            r8 = 3
            if (r7 == r8) goto L_0x0409
            r8 = 4
            if (r7 == r8) goto L_0x0400
            defpackage.br7.X(r1, r6)
            goto L_0x03e5
        L_0x0400:
            android.os.Parcelable$Creator<wh3> r4 = defpackage.wh3.CREATOR
            android.os.Parcelable r4 = defpackage.br7.o(r1, r6, r4)
            wh3 r4 = (defpackage.wh3) r4
            goto L_0x03e5
        L_0x0409:
            int r5 = defpackage.br7.U(r1, r6)
            goto L_0x03e5
        L_0x040e:
            android.os.Parcelable$Creator<pe5> r3 = defpackage.pe5.CREATOR
            java.lang.Object[] r3 = defpackage.br7.q(r1, r6, r3)
            pe5[] r3 = (defpackage.pe5[]) r3
            goto L_0x03e5
        L_0x0417:
            android.os.Bundle r2 = defpackage.br7.n(r1, r6)
            goto L_0x03e5
        L_0x041c:
            defpackage.br7.s(r1, r0)
            vig r0 = new vig
            r0.<init>()
            r0.a = r2
            r0.b = r3
            r0.c = r5
            r0.o = r4
            return r0
        L_0x042d:
            int r0 = defpackage.br7.d0(r28)
            r2 = 0
            r3 = 0
            r6 = r2
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r5 = r3
        L_0x0439:
            int r2 = r28.dataPosition()
            if (r2 >= r0) goto L_0x0480
            int r2 = r28.readInt()
            char r3 = (char) r2
            r4 = 1
            if (r3 == r4) goto L_0x047b
            r4 = 3
            if (r3 == r4) goto L_0x0476
            r4 = 4
            if (r3 == r4) goto L_0x0471
            r4 = 6
            if (r3 == r4) goto L_0x046c
            r4 = 7
            if (r3 == r4) goto L_0x0462
            r4 = 8
            if (r3 == r4) goto L_0x045b
            defpackage.br7.X(r1, r2)
            goto L_0x0439
        L_0x045b:
            android.os.Parcelable$Creator<pe5> r3 = defpackage.pe5.CREATOR
            java.util.ArrayList r9 = defpackage.br7.r(r1, r2, r3)
            goto L_0x0439
        L_0x0462:
            android.os.Parcelable$Creator<ghg> r3 = defpackage.ghg.CREATOR
            android.os.Parcelable r2 = defpackage.br7.o(r1, r2, r3)
            r10 = r2
            ghg r10 = (defpackage.ghg) r10
            goto L_0x0439
        L_0x046c:
            java.lang.String r8 = defpackage.br7.p(r1, r2)
            goto L_0x0439
        L_0x0471:
            java.lang.String r7 = defpackage.br7.p(r1, r2)
            goto L_0x0439
        L_0x0476:
            java.lang.String r6 = defpackage.br7.p(r1, r2)
            goto L_0x0439
        L_0x047b:
            int r5 = defpackage.br7.U(r1, r2)
            goto L_0x0439
        L_0x0480:
            defpackage.br7.s(r1, r0)
            ghg r0 = new ghg
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r0
        L_0x048a:
            int r0 = defpackage.br7.d0(r28)
            r2 = 0
            r3 = 1
            r6 = r2
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r5 = r3
        L_0x0497:
            int r2 = r28.dataPosition()
            if (r2 >= r0) goto L_0x04d6
            int r2 = r28.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x04d1;
                case 2: goto L_0x04c7;
                case 3: goto L_0x04c2;
                case 4: goto L_0x04b8;
                case 5: goto L_0x04b3;
                case 6: goto L_0x04ae;
                case 7: goto L_0x04a5;
                case 8: goto L_0x04a9;
                default: goto L_0x04a5;
            }
        L_0x04a5:
            defpackage.br7.X(r1, r2)
            goto L_0x0497
        L_0x04a9:
            java.lang.String r11 = defpackage.br7.p(r1, r2)
            goto L_0x0497
        L_0x04ae:
            android.os.IBinder r10 = defpackage.br7.T(r1, r2)
            goto L_0x0497
        L_0x04b3:
            android.os.IBinder r8 = defpackage.br7.T(r1, r2)
            goto L_0x0497
        L_0x04b8:
            android.os.Parcelable$Creator r3 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r2 = defpackage.br7.o(r1, r2, r3)
            r9 = r2
            android.app.PendingIntent r9 = (android.app.PendingIntent) r9
            goto L_0x0497
        L_0x04c2:
            android.os.IBinder r7 = defpackage.br7.T(r1, r2)
            goto L_0x0497
        L_0x04c7:
            android.os.Parcelable$Creator<lhg> r3 = defpackage.lhg.CREATOR
            android.os.Parcelable r2 = defpackage.br7.o(r1, r2, r3)
            r6 = r2
            lhg r6 = (defpackage.lhg) r6
            goto L_0x0497
        L_0x04d1:
            int r5 = defpackage.br7.U(r1, r2)
            goto L_0x0497
        L_0x04d6:
            defpackage.br7.s(r1, r0)
            mhg r0 = new mhg
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x04e0:
            int r0 = defpackage.br7.d0(r28)
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 0
            r5 = 0
            r13 = r2
            r7 = r4
            r8 = r7
            r9 = r5
            r10 = r9
            r11 = r10
            r12 = r11
        L_0x04f2:
            int r2 = r28.dataPosition()
            if (r2 >= r0) goto L_0x0546
            int r2 = r28.readInt()
            char r3 = (char) r2
            r4 = 1
            if (r3 == r4) goto L_0x053c
            r4 = 5
            if (r3 == r4) goto L_0x0534
            r4 = 8
            if (r3 == r4) goto L_0x052e
            r4 = 9
            if (r3 == r4) goto L_0x0528
            switch(r3) {
                case 11: goto L_0x0522;
                case 12: goto L_0x051c;
                case 13: goto L_0x0518;
                case 14: goto L_0x0512;
                default: goto L_0x050e;
            }
        L_0x050e:
            defpackage.br7.X(r1, r2)
            goto L_0x04f2
        L_0x0512:
            long r2 = defpackage.br7.V(r1, r2)
            r13 = r2
            goto L_0x04f2
        L_0x0518:
            defpackage.br7.p(r1, r2)
            goto L_0x04f2
        L_0x051c:
            boolean r2 = defpackage.br7.O(r1, r2)
            r12 = r2
            goto L_0x04f2
        L_0x0522:
            boolean r2 = defpackage.br7.O(r1, r2)
            r11 = r2
            goto L_0x04f2
        L_0x0528:
            boolean r2 = defpackage.br7.O(r1, r2)
            r10 = r2
            goto L_0x04f2
        L_0x052e:
            boolean r2 = defpackage.br7.O(r1, r2)
            r9 = r2
            goto L_0x04f2
        L_0x0534:
            android.os.Parcelable$Creator<m33> r3 = defpackage.m33.CREATOR
            java.util.ArrayList r2 = defpackage.br7.r(r1, r2, r3)
            r8 = r2
            goto L_0x04f2
        L_0x053c:
            android.os.Parcelable$Creator<com.google.android.gms.location.LocationRequest> r3 = com.google.android.gms.location.LocationRequest.CREATOR
            android.os.Parcelable r2 = defpackage.br7.o(r1, r2, r3)
            com.google.android.gms.location.LocationRequest r2 = (com.google.android.gms.location.LocationRequest) r2
            r7 = r2
            goto L_0x04f2
        L_0x0546:
            defpackage.br7.s(r1, r0)
            lhg r0 = new lhg
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x0550:
            int r0 = defpackage.br7.d0(r28)
            r2 = 0
            r3 = 0
            r6 = r2
            r7 = r6
            r8 = r7
            r9 = r8
            r5 = r3
        L_0x055b:
            int r2 = r28.dataPosition()
            if (r2 >= r0) goto L_0x0597
            int r2 = r28.readInt()
            char r3 = (char) r2
            r4 = 1
            if (r3 == r4) goto L_0x0592
            r4 = 2
            if (r3 == r4) goto L_0x058d
            r4 = 3
            if (r3 == r4) goto L_0x0588
            r4 = 4
            if (r3 == r4) goto L_0x057e
            r4 = 6
            if (r3 == r4) goto L_0x0579
            defpackage.br7.X(r1, r2)
            goto L_0x055b
        L_0x0579:
            java.lang.String r9 = defpackage.br7.p(r1, r2)
            goto L_0x055b
        L_0x057e:
            android.os.Parcelable$Creator r3 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r2 = defpackage.br7.o(r1, r2, r3)
            r8 = r2
            android.app.PendingIntent r8 = (android.app.PendingIntent) r8
            goto L_0x055b
        L_0x0588:
            android.os.IBinder r7 = defpackage.br7.T(r1, r2)
            goto L_0x055b
        L_0x058d:
            android.os.IBinder r6 = defpackage.br7.T(r1, r2)
            goto L_0x055b
        L_0x0592:
            int r5 = defpackage.br7.U(r1, r2)
            goto L_0x055b
        L_0x0597:
            defpackage.br7.s(r1, r0)
            khg r0 = new khg
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        L_0x05a1:
            int r0 = defpackage.br7.d0(r28)
            r2 = 0
            r3 = 0
        L_0x05a7:
            int r4 = r28.dataPosition()
            if (r4 >= r0) goto L_0x05c6
            int r4 = r28.readInt()
            char r5 = (char) r4
            r6 = 1
            if (r5 == r6) goto L_0x05c1
            r6 = 2
            if (r5 == r6) goto L_0x05bc
            defpackage.br7.X(r1, r4)
            goto L_0x05a7
        L_0x05bc:
            int r3 = defpackage.br7.U(r1, r4)
            goto L_0x05a7
        L_0x05c1:
            java.lang.String r2 = defpackage.br7.p(r1, r4)
            goto L_0x05a7
        L_0x05c6:
            defpackage.br7.s(r1, r0)
            lgg r0 = new lgg
            r0.<init>(r2, r3)
            return r0
        L_0x05cf:
            int r0 = defpackage.br7.d0(r28)
            java.lang.String r2 = ""
            r3 = 0
            r4 = r3
            r3 = r2
        L_0x05d8:
            int r5 = r28.dataPosition()
            if (r5 >= r0) goto L_0x0604
            int r5 = r28.readInt()
            char r6 = (char) r5
            r7 = 4
            if (r6 == r7) goto L_0x05ff
            r7 = 7
            if (r6 == r7) goto L_0x05f6
            r7 = 8
            if (r6 == r7) goto L_0x05f1
            defpackage.br7.X(r1, r5)
            goto L_0x05d8
        L_0x05f1:
            java.lang.String r3 = defpackage.br7.p(r1, r5)
            goto L_0x05d8
        L_0x05f6:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> r4 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR
            android.os.Parcelable r4 = defpackage.br7.o(r1, r5, r4)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r4 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r4
            goto L_0x05d8
        L_0x05ff:
            java.lang.String r2 = defpackage.br7.p(r1, r5)
            goto L_0x05d8
        L_0x0604:
            defpackage.br7.s(r1, r0)
            com.google.android.gms.auth.api.signin.SignInAccount r0 = new com.google.android.gms.auth.api.signin.SignInAccount
            r0.<init>()
            r0.b = r4
            java.lang.String r1 = "8.3 and 8.4 SDKs require non-null email"
            defpackage.fp3.k(r2, r1)
            r0.a = r2
            java.lang.String r1 = "8.3 and 8.4 SDKs require non-null userId"
            defpackage.fp3.k(r3, r1)
            r0.c = r3
            return r0
        L_0x061d:
            int r0 = defpackage.br7.d0(r28)
            r2 = -1
            r4 = 0
            r5 = 0
        L_0x0625:
            int r6 = r28.dataPosition()
            if (r6 >= r0) goto L_0x064c
            int r6 = r28.readInt()
            char r7 = (char) r6
            r8 = 1
            if (r7 == r8) goto L_0x0647
            r8 = 2
            if (r7 == r8) goto L_0x0642
            r8 = 3
            if (r7 == r8) goto L_0x063d
            defpackage.br7.X(r1, r6)
            goto L_0x0625
        L_0x063d:
            long r2 = defpackage.br7.V(r1, r6)
            goto L_0x0625
        L_0x0642:
            int r4 = defpackage.br7.U(r1, r6)
            goto L_0x0625
        L_0x0647:
            java.lang.String r5 = defpackage.br7.p(r1, r6)
            goto L_0x0625
        L_0x064c:
            defpackage.br7.s(r1, r0)
            pe5 r0 = new pe5
            r0.<init>(r2, r5, r4)
            return r0
        L_0x0655:
            int r0 = defpackage.br7.d0(r28)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = r3
            r8 = r4
            r9 = r8
            r10 = r5
            r3 = r2
            r4 = r7
            r5 = r4
            r6 = r5
        L_0x0666:
            int r12 = r28.dataPosition()
            if (r12 >= r0) goto L_0x06b0
            int r12 = r28.readInt()
            char r13 = (char) r12
            switch(r13) {
                case 2: goto L_0x06a7;
                case 3: goto L_0x069d;
                case 4: goto L_0x0698;
                case 5: goto L_0x0693;
                case 6: goto L_0x068e;
                case 7: goto L_0x0689;
                case 8: goto L_0x0684;
                case 9: goto L_0x067f;
                case 10: goto L_0x0678;
                default: goto L_0x0674;
            }
        L_0x0674:
            defpackage.br7.X(r1, r12)
            goto L_0x0666
        L_0x0678:
            android.os.Parcelable$Creator<tra> r3 = defpackage.tra.CREATOR
            java.util.ArrayList r3 = defpackage.br7.r(r1, r12, r3)
            goto L_0x0666
        L_0x067f:
            boolean r7 = defpackage.br7.O(r1, r12)
            goto L_0x0666
        L_0x0684:
            boolean r6 = defpackage.br7.O(r1, r12)
            goto L_0x0666
        L_0x0689:
            float r9 = defpackage.br7.R(r1, r12)
            goto L_0x0666
        L_0x068e:
            int r5 = defpackage.br7.U(r1, r12)
            goto L_0x0666
        L_0x0693:
            int r4 = defpackage.br7.U(r1, r12)
            goto L_0x0666
        L_0x0698:
            float r8 = defpackage.br7.R(r1, r12)
            goto L_0x0666
        L_0x069d:
            r10 = 8
            defpackage.br7.h0(r1, r12, r10)
            double r10 = r28.readDouble()
            goto L_0x0666
        L_0x06a7:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLng> r2 = com.google.android.gms.maps.model.LatLng.CREATOR
            android.os.Parcelable r2 = defpackage.br7.o(r1, r12, r2)
            com.google.android.gms.maps.model.LatLng r2 = (com.google.android.gms.maps.model.LatLng) r2
            goto L_0x0666
        L_0x06b0:
            defpackage.br7.s(r1, r0)
            w13 r0 = new w13
            r0.<init>()
            r0.a = r2
            r0.b = r10
            r0.c = r8
            r0.o = r4
            r0.X = r5
            r0.Y = r9
            r0.Z = r6
            r0.s0 = r7
            r0.t0 = r3
            return r0
        L_0x06cb:
            android.os.IBinder r0 = r28.readStrongBinder()
            sgg r1 = new sgg
            r1.<init>(r0)
            return r1
        L_0x06d5:
            int r0 = defpackage.br7.d0(r28)
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r3
            r3 = r4
        L_0x06de:
            int r6 = r28.dataPosition()
            if (r6 >= r0) goto L_0x0715
            int r6 = r28.readInt()
            char r7 = (char) r6
            r8 = 1
            if (r7 == r8) goto L_0x0710
            r8 = 2
            if (r7 == r8) goto L_0x070b
            r8 = 3
            if (r7 == r8) goto L_0x0702
            r8 = 4
            if (r7 == r8) goto L_0x06f9
            defpackage.br7.X(r1, r6)
            goto L_0x06de
        L_0x06f9:
            android.os.Parcelable$Creator<ph3> r4 = defpackage.ph3.CREATOR
            android.os.Parcelable r4 = defpackage.br7.o(r1, r6, r4)
            ph3 r4 = (defpackage.ph3) r4
            goto L_0x06de
        L_0x0702:
            android.os.Parcelable$Creator r3 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r3 = defpackage.br7.o(r1, r6, r3)
            android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            goto L_0x06de
        L_0x070b:
            java.lang.String r2 = defpackage.br7.p(r1, r6)
            goto L_0x06de
        L_0x0710:
            int r5 = defpackage.br7.U(r1, r6)
            goto L_0x06de
        L_0x0715:
            defpackage.br7.s(r1, r0)
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r5, r2, r3, r4)
            return r0
        L_0x071e:
            int r0 = defpackage.br7.d0(r28)
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = r4
            r3 = r2
        L_0x0727:
            int r6 = r28.dataPosition()
            if (r6 >= r0) goto L_0x075a
            int r6 = r28.readInt()
            char r7 = (char) r6
            r8 = 1
            if (r7 == r8) goto L_0x0755
            r8 = 2
            if (r7 == r8) goto L_0x0750
            r8 = 3
            if (r7 == r8) goto L_0x0747
            r8 = 4
            if (r7 == r8) goto L_0x0742
            defpackage.br7.X(r1, r6)
            goto L_0x0727
        L_0x0742:
            java.lang.String r3 = defpackage.br7.p(r1, r6)
            goto L_0x0727
        L_0x0747:
            android.os.Parcelable$Creator r2 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r2 = defpackage.br7.o(r1, r6, r2)
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2
            goto L_0x0727
        L_0x0750:
            int r5 = defpackage.br7.U(r1, r6)
            goto L_0x0727
        L_0x0755:
            int r4 = defpackage.br7.U(r1, r6)
            goto L_0x0727
        L_0x075a:
            defpackage.br7.s(r1, r0)
            ph3 r0 = new ph3
            r0.<init>(r4, r5, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ufg.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ph3[i];
            case 1:
                return new Status[i];
            case 2:
                return new sgg[i];
            case 3:
                return new w13[i];
            case 4:
                return new pe5[i];
            case 5:
                return new SignInAccount[i];
            case 6:
                return new lgg[i];
            case 7:
                return new khg[i];
            case 8:
                return new lhg[i];
            case 9:
                return new mhg[i];
            case 10:
                return new ghg[i];
            case 11:
                return new vig[i];
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new wh3[i];
            case 13:
                return new ejg[i];
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new LatLngBounds[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new qc6[i];
            case 16:
                return new LatLng[i];
            case LangUtils.HASH_SEED /*17*/:
                return new wy7[i];
            case 18:
                return new g08[i];
            case 19:
                return new tra[i];
            case 20:
                return new i5b[i];
            case 21:
                return new txd[i];
            default:
                return new SignInConfiguration[i];
        }
    }
}
