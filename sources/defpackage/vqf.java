package defpackage;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: vqf  reason: default package */
public final class vqf implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ vqf(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r3v23, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v68, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r0v37, types: [java.lang.Object, com.google.android.gms.maps.GoogleMapOptions] */
    /* JADX WARNING: type inference failed for: r3v73, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r3v74, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v107, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r46) {
        /*
            r45 = this;
            r0 = r45
            r1 = r46
            int r0 = r0.a
            switch(r0) {
                case 0: goto L_0x08e3;
                case 1: goto L_0x08dd;
                case 2: goto L_0x08a6;
                case 3: goto L_0x0878;
                case 4: goto L_0x0848;
                case 5: goto L_0x080d;
                case 6: goto L_0x0787;
                case 7: goto L_0x071d;
                case 8: goto L_0x06dd;
                case 9: goto L_0x069d;
                case 10: goto L_0x0633;
                case 11: goto L_0x05ea;
                case 12: goto L_0x0599;
                case 13: goto L_0x0554;
                case 14: goto L_0x052b;
                case 15: goto L_0x04fd;
                case 16: goto L_0x04ad;
                case 17: goto L_0x045c;
                case 18: goto L_0x032c;
                case 19: goto L_0x02da;
                case 20: goto L_0x02a2;
                case 21: goto L_0x01d5;
                case 22: goto L_0x01ad;
                case 23: goto L_0x0173;
                case 24: goto L_0x013d;
                case 25: goto L_0x00f8;
                case 26: goto L_0x00ad;
                case 27: goto L_0x0068;
                case 28: goto L_0x0024;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Class<hkc> r0 = defpackage.hkc.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r1.readParcelable(r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            int r1 = r46.readInt()
            if (r1 == 0) goto L_0x001d
            r1 = 1
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            zeg r2 = new zeg
            r2.<init>(r0, r1)
            return r2
        L_0x0024:
            int r0 = defpackage.br7.d0(r46)
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r4
        L_0x002c:
            int r6 = r46.dataPosition()
            if (r6 >= r0) goto L_0x0053
            int r6 = r46.readInt()
            char r7 = (char) r6
            r8 = 2
            if (r7 == r8) goto L_0x004e
            r8 = 3
            if (r7 == r8) goto L_0x0049
            r8 = 4
            if (r7 == r8) goto L_0x0044
            defpackage.br7.X(r1, r6)
            goto L_0x002c
        L_0x0044:
            java.lang.Float r5 = defpackage.br7.S(r1, r6)
            goto L_0x002c
        L_0x0049:
            android.os.IBinder r4 = defpackage.br7.T(r1, r6)
            goto L_0x002c
        L_0x004e:
            int r3 = defpackage.br7.U(r1, r6)
            goto L_0x002c
        L_0x0053:
            defpackage.br7.s(r1, r0)
            ez1 r0 = new ez1
            if (r4 != 0) goto L_0x005b
            goto L_0x0064
        L_0x005b:
            xr6 r1 = defpackage.oy9.K0(r4)
            rxd r2 = new rxd
            r2.<init>((defpackage.xr6) r1)
        L_0x0064:
            r0.<init>(r3, r2, r5)
            return r0
        L_0x0068:
            int r0 = defpackage.br7.d0(r46)
            r2 = -1
            r4 = 1
            r8 = r2
            r10 = r8
            r6 = r4
            r7 = r6
        L_0x0073:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x00a3
            int r2 = r46.readInt()
            char r3 = (char) r2
            if (r3 == r4) goto L_0x009e
            r5 = 2
            if (r3 == r5) goto L_0x0099
            r5 = 3
            if (r3 == r5) goto L_0x0093
            r5 = 4
            if (r3 == r5) goto L_0x008d
            defpackage.br7.X(r1, r2)
            goto L_0x0073
        L_0x008d:
            long r2 = defpackage.br7.V(r1, r2)
            r10 = r2
            goto L_0x0073
        L_0x0093:
            long r2 = defpackage.br7.V(r1, r2)
            r8 = r2
            goto L_0x0073
        L_0x0099:
            int r7 = defpackage.br7.U(r1, r2)
            goto L_0x0073
        L_0x009e:
            int r6 = defpackage.br7.U(r1, r2)
            goto L_0x0073
        L_0x00a3:
            defpackage.br7.s(r1, r0)
            nfg r0 = new nfg
            r5 = r0
            r5.<init>(r6, r7, r8, r10)
            return r0
        L_0x00ad:
            int r0 = defpackage.br7.d0(r46)
            r2 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        L_0x00b7:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x00ee
            int r2 = r46.readInt()
            char r3 = (char) r2
            r9 = 1
            if (r3 == r9) goto L_0x00e9
            r9 = 2
            if (r3 == r9) goto L_0x00e4
            r9 = 3
            if (r3 == r9) goto L_0x00df
            r9 = 4
            if (r3 == r9) goto L_0x00da
            r9 = 5
            if (r3 == r9) goto L_0x00d5
            defpackage.br7.X(r1, r2)
            goto L_0x00b7
        L_0x00d5:
            int r8 = defpackage.br7.U(r1, r2)
            goto L_0x00b7
        L_0x00da:
            int r7 = defpackage.br7.U(r1, r2)
            goto L_0x00b7
        L_0x00df:
            boolean r6 = defpackage.br7.O(r1, r2)
            goto L_0x00b7
        L_0x00e4:
            boolean r5 = defpackage.br7.O(r1, r2)
            goto L_0x00b7
        L_0x00e9:
            int r4 = defpackage.br7.U(r1, r2)
            goto L_0x00b7
        L_0x00ee:
            defpackage.br7.s(r1, r0)
            xmc r0 = new xmc
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r0
        L_0x00f8:
            int r0 = defpackage.br7.d0(r46)
            r2 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L_0x0103:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x0133
            int r2 = r46.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x012e;
                case 2: goto L_0x0129;
                case 3: goto L_0x0124;
                case 4: goto L_0x011f;
                case 5: goto L_0x011a;
                case 6: goto L_0x0115;
                default: goto L_0x0111;
            }
        L_0x0111:
            defpackage.br7.X(r1, r2)
            goto L_0x0103
        L_0x0115:
            boolean r9 = defpackage.br7.O(r1, r2)
            goto L_0x0103
        L_0x011a:
            boolean r8 = defpackage.br7.O(r1, r2)
            goto L_0x0103
        L_0x011f:
            boolean r7 = defpackage.br7.O(r1, r2)
            goto L_0x0103
        L_0x0124:
            boolean r6 = defpackage.br7.O(r1, r2)
            goto L_0x0103
        L_0x0129:
            boolean r5 = defpackage.br7.O(r1, r2)
            goto L_0x0103
        L_0x012e:
            boolean r4 = defpackage.br7.O(r1, r2)
            goto L_0x0103
        L_0x0133:
            defpackage.br7.s(r1, r0)
            sr7 r0 = new sr7
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r0
        L_0x013d:
            int r0 = defpackage.br7.d0(r46)
            r2 = 0
            r3 = r2
        L_0x0143:
            int r4 = r46.dataPosition()
            if (r4 >= r0) goto L_0x016a
            int r4 = r46.readInt()
            char r5 = (char) r4
            r6 = 1
            if (r5 == r6) goto L_0x0161
            r6 = 2
            if (r5 == r6) goto L_0x0158
            defpackage.br7.X(r1, r4)
            goto L_0x0143
        L_0x0158:
            android.os.Parcelable$Creator<sr7> r3 = defpackage.sr7.CREATOR
            android.os.Parcelable r3 = defpackage.br7.o(r1, r4, r3)
            sr7 r3 = (defpackage.sr7) r3
            goto L_0x0143
        L_0x0161:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r2 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r2 = defpackage.br7.o(r1, r4, r2)
            com.google.android.gms.common.api.Status r2 = (com.google.android.gms.common.api.Status) r2
            goto L_0x0143
        L_0x016a:
            defpackage.br7.s(r1, r0)
            rr7 r0 = new rr7
            r0.<init>(r2, r3)
            return r0
        L_0x0173:
            int r0 = defpackage.br7.d0(r46)
            r2 = 0
            r3 = 0
            r4 = r3
            r3 = r2
        L_0x017b:
            int r5 = r46.dataPosition()
            if (r5 >= r0) goto L_0x01a4
            int r5 = r46.readInt()
            char r6 = (char) r5
            r7 = 1
            if (r6 == r7) goto L_0x019d
            r7 = 2
            if (r6 == r7) goto L_0x0198
            r7 = 3
            if (r6 == r7) goto L_0x0193
            defpackage.br7.X(r1, r5)
            goto L_0x017b
        L_0x0193:
            boolean r3 = defpackage.br7.O(r1, r5)
            goto L_0x017b
        L_0x0198:
            boolean r2 = defpackage.br7.O(r1, r5)
            goto L_0x017b
        L_0x019d:
            android.os.Parcelable$Creator<com.google.android.gms.location.LocationRequest> r4 = com.google.android.gms.location.LocationRequest.CREATOR
            java.util.ArrayList r4 = defpackage.br7.r(r1, r5, r4)
            goto L_0x017b
        L_0x01a4:
            defpackage.br7.s(r1, r0)
            qr7 r0 = new qr7
            r0.<init>(r4, r2, r3)
            return r0
        L_0x01ad:
            int r0 = defpackage.br7.d0(r46)
            java.util.List r2 = com.google.android.gms.location.LocationResult.b
        L_0x01b3:
            int r3 = r46.dataPosition()
            if (r3 >= r0) goto L_0x01cc
            int r3 = r46.readInt()
            char r4 = (char) r3
            r5 = 1
            if (r4 == r5) goto L_0x01c5
            defpackage.br7.X(r1, r3)
            goto L_0x01b3
        L_0x01c5:
            android.os.Parcelable$Creator r2 = android.location.Location.CREATOR
            java.util.ArrayList r2 = defpackage.br7.r(r1, r3, r2)
            goto L_0x01b3
        L_0x01cc:
            defpackage.br7.s(r1, r0)
            com.google.android.gms.location.LocationResult r0 = new com.google.android.gms.location.LocationResult
            r0.<init>(r2)
            return r0
        L_0x01d5:
            int r0 = defpackage.br7.d0(r46)
            android.os.WorkSource r2 = new android.os.WorkSource
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = -1
            r7 = 0
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 0
            r13 = 600000(0x927c0, double:2.964394E-318)
            r15 = 3600000(0x36ee80, double:1.7786363E-317)
            r17 = 102(0x66, float:1.43E-43)
            r38 = r2
            r39 = r3
            r32 = r4
            r35 = r32
            r36 = r35
            r37 = r36
            r33 = r5
            r31 = r7
            r30 = r8
            r26 = r9
            r28 = r26
            r24 = r11
            r22 = r13
            r20 = r15
            r19 = r17
        L_0x0213:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x0297
            int r2 = r46.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x028f;
                case 2: goto L_0x0288;
                case 3: goto L_0x0281;
                case 4: goto L_0x0221;
                case 5: goto L_0x027a;
                case 6: goto L_0x0273;
                case 7: goto L_0x026c;
                case 8: goto L_0x0265;
                case 9: goto L_0x025e;
                case 10: goto L_0x0257;
                case 11: goto L_0x0250;
                case 12: goto L_0x0249;
                case 13: goto L_0x0242;
                case 14: goto L_0x0221;
                case 15: goto L_0x023b;
                case 16: goto L_0x0230;
                case 17: goto L_0x0225;
                default: goto L_0x0221;
            }
        L_0x0221:
            defpackage.br7.X(r1, r2)
            goto L_0x0213
        L_0x0225:
            android.os.Parcelable$Creator<ghg> r3 = defpackage.ghg.CREATOR
            android.os.Parcelable r2 = defpackage.br7.o(r1, r2, r3)
            ghg r2 = (defpackage.ghg) r2
            r39 = r2
            goto L_0x0213
        L_0x0230:
            android.os.Parcelable$Creator r3 = android.os.WorkSource.CREATOR
            android.os.Parcelable r2 = defpackage.br7.o(r1, r2, r3)
            android.os.WorkSource r2 = (android.os.WorkSource) r2
            r38 = r2
            goto L_0x0213
        L_0x023b:
            boolean r2 = defpackage.br7.O(r1, r2)
            r37 = r2
            goto L_0x0213
        L_0x0242:
            int r2 = defpackage.br7.U(r1, r2)
            r36 = r2
            goto L_0x0213
        L_0x0249:
            int r2 = defpackage.br7.U(r1, r2)
            r35 = r2
            goto L_0x0213
        L_0x0250:
            long r2 = defpackage.br7.V(r1, r2)
            r33 = r2
            goto L_0x0213
        L_0x0257:
            long r2 = defpackage.br7.V(r1, r2)
            r28 = r2
            goto L_0x0213
        L_0x025e:
            boolean r2 = defpackage.br7.O(r1, r2)
            r32 = r2
            goto L_0x0213
        L_0x0265:
            long r2 = defpackage.br7.V(r1, r2)
            r24 = r2
            goto L_0x0213
        L_0x026c:
            float r2 = defpackage.br7.R(r1, r2)
            r31 = r2
            goto L_0x0213
        L_0x0273:
            int r2 = defpackage.br7.U(r1, r2)
            r30 = r2
            goto L_0x0213
        L_0x027a:
            long r2 = defpackage.br7.V(r1, r2)
            r26 = r2
            goto L_0x0213
        L_0x0281:
            long r2 = defpackage.br7.V(r1, r2)
            r22 = r2
            goto L_0x0213
        L_0x0288:
            long r2 = defpackage.br7.V(r1, r2)
            r20 = r2
            goto L_0x0213
        L_0x028f:
            int r2 = defpackage.br7.U(r1, r2)
            r19 = r2
            goto L_0x0213
        L_0x0297:
            defpackage.br7.s(r1, r0)
            com.google.android.gms.location.LocationRequest r0 = new com.google.android.gms.location.LocationRequest
            r18 = r0
            r18.<init>(r19, r20, r22, r24, r26, r28, r30, r31, r32, r33, r35, r36, r37, r38, r39)
            return r0
        L_0x02a2:
            int r0 = defpackage.br7.d0(r46)
            r2 = 0
            r4 = 0
        L_0x02a9:
            int r5 = r46.dataPosition()
            if (r5 >= r0) goto L_0x02d1
            int r5 = r46.readInt()
            char r6 = (char) r5
            r7 = 2
            if (r6 == r7) goto L_0x02c8
            r7 = 3
            if (r6 == r7) goto L_0x02be
            defpackage.br7.X(r1, r5)
            goto L_0x02a9
        L_0x02be:
            r2 = 8
            defpackage.br7.h0(r1, r5, r2)
            double r2 = r46.readDouble()
            goto L_0x02a9
        L_0x02c8:
            android.os.Parcelable$Creator<mae> r4 = defpackage.mae.CREATOR
            android.os.Parcelable r4 = defpackage.br7.o(r1, r5, r4)
            mae r4 = (defpackage.mae) r4
            goto L_0x02a9
        L_0x02d1:
            defpackage.br7.s(r1, r0)
            pae r0 = new pae
            r0.<init>(r4, r2)
            return r0
        L_0x02da:
            int r0 = defpackage.br7.d0(r46)
            r2 = 0
            r3 = 0
            r4 = 0
            r10 = r2
            r7 = r3
            r8 = r7
            r9 = r8
            r6 = r4
        L_0x02e6:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x0322
            int r2 = r46.readInt()
            char r3 = (char) r2
            r4 = 2
            if (r3 == r4) goto L_0x031d
            r4 = 3
            if (r3 == r4) goto L_0x0318
            r4 = 4
            if (r3 == r4) goto L_0x0313
            r4 = 5
            if (r3 == r4) goto L_0x030e
            r4 = 6
            if (r3 == r4) goto L_0x0304
            defpackage.br7.X(r1, r2)
            goto L_0x02e6
        L_0x0304:
            android.os.Parcelable$Creator<txd> r3 = defpackage.txd.CREATOR
            android.os.Parcelable r2 = defpackage.br7.o(r1, r2, r3)
            r10 = r2
            txd r10 = (defpackage.txd) r10
            goto L_0x02e6
        L_0x030e:
            boolean r9 = defpackage.br7.O(r1, r2)
            goto L_0x02e6
        L_0x0313:
            int r8 = defpackage.br7.U(r1, r2)
            goto L_0x02e6
        L_0x0318:
            int r7 = defpackage.br7.U(r1, r2)
            goto L_0x02e6
        L_0x031d:
            float r6 = defpackage.br7.R(r1, r2)
            goto L_0x02e6
        L_0x0322:
            defpackage.br7.s(r1, r0)
            mae r0 = new mae
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            return r0
        L_0x032c:
            int r0 = defpackage.br7.d0(r46)
            r2 = 0
            r5 = r2
            r6 = -1
            r7 = -1
            r8 = 0
            r9 = -1
            r10 = -1
            r11 = -1
            r12 = -1
            r13 = -1
            r14 = -1
            r15 = -1
            r16 = -1
            r17 = -1
            r18 = -1
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
        L_0x034c:
            int r3 = r46.dataPosition()
            if (r3 >= r0) goto L_0x03e3
            int r3 = r46.readInt()
            char r4 = (char) r3
            switch(r4) {
                case 2: goto L_0x03dd;
                case 3: goto L_0x03d7;
                case 4: goto L_0x03d1;
                case 5: goto L_0x03c6;
                case 6: goto L_0x03c1;
                case 7: goto L_0x03bc;
                case 8: goto L_0x03b7;
                case 9: goto L_0x03b2;
                case 10: goto L_0x03ad;
                case 11: goto L_0x03a8;
                case 12: goto L_0x03a3;
                case 13: goto L_0x035a;
                case 14: goto L_0x039e;
                case 15: goto L_0x0399;
                case 16: goto L_0x0394;
                case 17: goto L_0x038f;
                case 18: goto L_0x0384;
                case 19: goto L_0x037f;
                case 20: goto L_0x0368;
                case 21: goto L_0x0363;
                case 22: goto L_0x035a;
                case 23: goto L_0x035e;
                default: goto L_0x035a;
            }
        L_0x035a:
            defpackage.br7.X(r1, r3)
            goto L_0x034c
        L_0x035e:
            int r5 = defpackage.br7.U(r1, r3)
            goto L_0x034c
        L_0x0363:
            java.lang.String r44 = defpackage.br7.p(r1, r3)
            goto L_0x034c
        L_0x0368:
            int r3 = defpackage.br7.W(r1, r3)
            if (r3 != 0) goto L_0x0371
            r43 = 0
            goto L_0x034c
        L_0x0371:
            defpackage.br7.f0(r1, r3)
            int r3 = r46.readInt()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r43 = r3
            goto L_0x034c
        L_0x037f:
            byte r18 = defpackage.br7.P(r1, r3)
            goto L_0x034c
        L_0x0384:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLngBounds> r4 = com.google.android.gms.maps.model.LatLngBounds.CREATOR
            android.os.Parcelable r3 = defpackage.br7.o(r1, r3, r4)
            r42 = r3
            com.google.android.gms.maps.model.LatLngBounds r42 = (com.google.android.gms.maps.model.LatLngBounds) r42
            goto L_0x034c
        L_0x038f:
            java.lang.Float r41 = defpackage.br7.S(r1, r3)
            goto L_0x034c
        L_0x0394:
            java.lang.Float r40 = defpackage.br7.S(r1, r3)
            goto L_0x034c
        L_0x0399:
            byte r17 = defpackage.br7.P(r1, r3)
            goto L_0x034c
        L_0x039e:
            byte r16 = defpackage.br7.P(r1, r3)
            goto L_0x034c
        L_0x03a3:
            byte r15 = defpackage.br7.P(r1, r3)
            goto L_0x034c
        L_0x03a8:
            byte r14 = defpackage.br7.P(r1, r3)
            goto L_0x034c
        L_0x03ad:
            byte r13 = defpackage.br7.P(r1, r3)
            goto L_0x034c
        L_0x03b2:
            byte r12 = defpackage.br7.P(r1, r3)
            goto L_0x034c
        L_0x03b7:
            byte r11 = defpackage.br7.P(r1, r3)
            goto L_0x034c
        L_0x03bc:
            byte r10 = defpackage.br7.P(r1, r3)
            goto L_0x034c
        L_0x03c1:
            byte r9 = defpackage.br7.P(r1, r3)
            goto L_0x034c
        L_0x03c6:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.CameraPosition> r4 = com.google.android.gms.maps.model.CameraPosition.CREATOR
            android.os.Parcelable r3 = defpackage.br7.o(r1, r3, r4)
            r8 = r3
            com.google.android.gms.maps.model.CameraPosition r8 = (com.google.android.gms.maps.model.CameraPosition) r8
            goto L_0x034c
        L_0x03d1:
            int r2 = defpackage.br7.U(r1, r3)
            goto L_0x034c
        L_0x03d7:
            byte r7 = defpackage.br7.P(r1, r3)
            goto L_0x034c
        L_0x03dd:
            byte r6 = defpackage.br7.P(r1, r3)
            goto L_0x034c
        L_0x03e3:
            defpackage.br7.s(r1, r0)
            com.google.android.gms.maps.GoogleMapOptions r0 = new com.google.android.gms.maps.GoogleMapOptions
            r0.<init>()
            r1 = -1
            r0.c = r1
            r1 = 0
            r0.y0 = r1
            r0.z0 = r1
            r0.A0 = r1
            r0.C0 = r1
            r0.D0 = r1
            java.lang.Boolean r1 = defpackage.br7.g0(r6)
            r0.a = r1
            java.lang.Boolean r1 = defpackage.br7.g0(r7)
            r0.b = r1
            r0.c = r2
            r0.o = r8
            java.lang.Boolean r1 = defpackage.br7.g0(r9)
            r0.X = r1
            java.lang.Boolean r1 = defpackage.br7.g0(r10)
            r0.Y = r1
            java.lang.Boolean r1 = defpackage.br7.g0(r11)
            r0.Z = r1
            java.lang.Boolean r1 = defpackage.br7.g0(r12)
            r0.s0 = r1
            java.lang.Boolean r1 = defpackage.br7.g0(r13)
            r0.t0 = r1
            java.lang.Boolean r1 = defpackage.br7.g0(r14)
            r0.u0 = r1
            java.lang.Boolean r1 = defpackage.br7.g0(r15)
            r0.v0 = r1
            java.lang.Boolean r1 = defpackage.br7.g0(r16)
            r0.w0 = r1
            java.lang.Boolean r1 = defpackage.br7.g0(r17)
            r0.x0 = r1
            r3 = r40
            r0.y0 = r3
            r3 = r41
            r0.z0 = r3
            r3 = r42
            r0.A0 = r3
            java.lang.Boolean r1 = defpackage.br7.g0(r18)
            r0.B0 = r1
            r3 = r43
            r0.C0 = r3
            r3 = r44
            r0.D0 = r3
            r0.E0 = r5
            return r0
        L_0x045c:
            int r0 = defpackage.br7.d0(r46)
            r2 = 0
            r3 = 0
            r5 = 1
            r6 = 1000(0x3e8, float:1.401E-42)
            r13 = r2
            r11 = r3
            r9 = r5
            r10 = r9
            r8 = r6
        L_0x046b:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x04a3
            int r2 = r46.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x049d;
                case 2: goto L_0x0497;
                case 3: goto L_0x0491;
                case 4: goto L_0x048b;
                case 5: goto L_0x0481;
                case 6: goto L_0x047d;
                default: goto L_0x0479;
            }
        L_0x0479:
            defpackage.br7.X(r1, r2)
            goto L_0x046b
        L_0x047d:
            defpackage.br7.O(r1, r2)
            goto L_0x046b
        L_0x0481:
            android.os.Parcelable$Creator<nfg> r3 = defpackage.nfg.CREATOR
            java.lang.Object[] r2 = defpackage.br7.q(r1, r2, r3)
            nfg[] r2 = (defpackage.nfg[]) r2
            r13 = r2
            goto L_0x046b
        L_0x048b:
            int r2 = defpackage.br7.U(r1, r2)
            r8 = r2
            goto L_0x046b
        L_0x0491:
            long r2 = defpackage.br7.V(r1, r2)
            r11 = r2
            goto L_0x046b
        L_0x0497:
            int r2 = defpackage.br7.U(r1, r2)
            r10 = r2
            goto L_0x046b
        L_0x049d:
            int r2 = defpackage.br7.U(r1, r2)
            r9 = r2
            goto L_0x046b
        L_0x04a3:
            defpackage.br7.s(r1, r0)
            com.google.android.gms.location.LocationAvailability r0 = new com.google.android.gms.location.LocationAvailability
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r13)
            return r0
        L_0x04ad:
            int r0 = defpackage.br7.d0(r46)
            r2 = 0
            r3 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = r2
            r9 = r3
            r10 = r9
            r7 = r4
        L_0x04bc:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x04f3
            int r2 = r46.readInt()
            char r3 = (char) r2
            r4 = 1
            if (r3 == r4) goto L_0x04ed
            r4 = 2
            if (r3 == r4) goto L_0x04e7
            r4 = 3
            if (r3 == r4) goto L_0x04e1
            r4 = 5
            if (r3 == r4) goto L_0x04d7
            defpackage.br7.X(r1, r2)
            goto L_0x04bc
        L_0x04d7:
            android.os.Parcelable$Creator<ghg> r3 = defpackage.ghg.CREATOR
            android.os.Parcelable r2 = defpackage.br7.o(r1, r2, r3)
            ghg r2 = (defpackage.ghg) r2
            r11 = r2
            goto L_0x04bc
        L_0x04e1:
            boolean r2 = defpackage.br7.O(r1, r2)
            r10 = r2
            goto L_0x04bc
        L_0x04e7:
            int r2 = defpackage.br7.U(r1, r2)
            r9 = r2
            goto L_0x04bc
        L_0x04ed:
            long r2 = defpackage.br7.V(r1, r2)
            r7 = r2
            goto L_0x04bc
        L_0x04f3:
            defpackage.br7.s(r1, r0)
            yd7 r0 = new yd7
            r6 = r0
            r6.<init>(r7, r9, r10, r11)
            return r0
        L_0x04fd:
            int r0 = defpackage.br7.d0(r46)
            r2 = 0
            r3 = 0
        L_0x0503:
            int r4 = r46.dataPosition()
            if (r4 >= r0) goto L_0x0522
            int r4 = r46.readInt()
            char r5 = (char) r4
            r6 = 1
            if (r5 == r6) goto L_0x051d
            r6 = 2
            if (r5 == r6) goto L_0x0518
            defpackage.br7.X(r1, r4)
            goto L_0x0503
        L_0x0518:
            java.lang.String r2 = defpackage.br7.p(r1, r4)
            goto L_0x0503
        L_0x051d:
            int r3 = defpackage.br7.U(r1, r4)
            goto L_0x0503
        L_0x0522:
            defpackage.br7.s(r1, r0)
            com.google.android.gms.common.api.Scope r0 = new com.google.android.gms.common.api.Scope
            r0.<init>(r3, r2)
            return r0
        L_0x052b:
            int r0 = defpackage.br7.d0(r46)
            r2 = 0
        L_0x0530:
            int r3 = r46.dataPosition()
            if (r3 >= r0) goto L_0x054b
            int r3 = r46.readInt()
            char r4 = (char) r3
            r5 = 1
            if (r4 == r5) goto L_0x0542
            defpackage.br7.X(r1, r3)
            goto L_0x0530
        L_0x0542:
            android.os.Parcelable$Creator r2 = android.content.Intent.CREATOR
            android.os.Parcelable r2 = defpackage.br7.o(r1, r3, r2)
            android.content.Intent r2 = (android.content.Intent) r2
            goto L_0x0530
        L_0x054b:
            defpackage.br7.s(r1, r0)
            r43 r0 = new r43
            r0.<init>(r2)
            return r0
        L_0x0554:
            int r0 = defpackage.br7.d0(r46)
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r3
            r3 = r4
        L_0x055d:
            int r6 = r46.dataPosition()
            if (r6 >= r0) goto L_0x0590
            int r6 = r46.readInt()
            char r7 = (char) r6
            r8 = 2
            if (r7 == r8) goto L_0x0587
            r8 = 3
            if (r7 == r8) goto L_0x0582
            r8 = 4
            if (r7 == r8) goto L_0x057d
            r8 = 5
            if (r7 == r8) goto L_0x0578
            defpackage.br7.X(r1, r6)
            goto L_0x055d
        L_0x0578:
            float r4 = defpackage.br7.R(r1, r6)
            goto L_0x055d
        L_0x057d:
            float r3 = defpackage.br7.R(r1, r6)
            goto L_0x055d
        L_0x0582:
            float r2 = defpackage.br7.R(r1, r6)
            goto L_0x055d
        L_0x0587:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLng> r5 = com.google.android.gms.maps.model.LatLng.CREATOR
            android.os.Parcelable r5 = defpackage.br7.o(r1, r6, r5)
            com.google.android.gms.maps.model.LatLng r5 = (com.google.android.gms.maps.model.LatLng) r5
            goto L_0x055d
        L_0x0590:
            defpackage.br7.s(r1, r0)
            com.google.android.gms.maps.model.CameraPosition r0 = new com.google.android.gms.maps.model.CameraPosition
            r0.<init>(r5, r2, r3, r4)
            return r0
        L_0x0599:
            int r0 = defpackage.br7.d0(r46)
            r2 = 0
            r3 = 0
            r5 = r2
            r8 = r5
            r9 = r8
            r6 = r3
            r7 = r6
        L_0x05a4:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x05e0
            int r2 = r46.readInt()
            char r3 = (char) r2
            r4 = 1
            if (r3 == r4) goto L_0x05db
            r4 = 2
            if (r3 == r4) goto L_0x05d6
            r4 = 3
            if (r3 == r4) goto L_0x05cc
            r4 = 4
            if (r3 == r4) goto L_0x05c7
            r4 = 5
            if (r3 == r4) goto L_0x05c2
            defpackage.br7.X(r1, r2)
            goto L_0x05a4
        L_0x05c2:
            boolean r9 = defpackage.br7.O(r1, r2)
            goto L_0x05a4
        L_0x05c7:
            boolean r8 = defpackage.br7.O(r1, r2)
            goto L_0x05a4
        L_0x05cc:
            android.os.Parcelable$Creator<ph3> r3 = defpackage.ph3.CREATOR
            android.os.Parcelable r2 = defpackage.br7.o(r1, r2, r3)
            r7 = r2
            ph3 r7 = (defpackage.ph3) r7
            goto L_0x05a4
        L_0x05d6:
            android.os.IBinder r6 = defpackage.br7.T(r1, r2)
            goto L_0x05a4
        L_0x05db:
            int r5 = defpackage.br7.U(r1, r2)
            goto L_0x05a4
        L_0x05e0:
            defpackage.br7.s(r1, r0)
            weg r0 = new weg
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        L_0x05ea:
            int r0 = defpackage.br7.d0(r46)
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = r4
            r3 = r2
        L_0x05f3:
            int r6 = r46.dataPosition()
            if (r6 >= r0) goto L_0x062a
            int r6 = r46.readInt()
            char r7 = (char) r6
            r8 = 1
            if (r7 == r8) goto L_0x0625
            r8 = 2
            if (r7 == r8) goto L_0x061c
            r8 = 3
            if (r7 == r8) goto L_0x0617
            r8 = 4
            if (r7 == r8) goto L_0x060e
            defpackage.br7.X(r1, r6)
            goto L_0x05f3
        L_0x060e:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> r3 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR
            android.os.Parcelable r3 = defpackage.br7.o(r1, r6, r3)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r3 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r3
            goto L_0x05f3
        L_0x0617:
            int r5 = defpackage.br7.U(r1, r6)
            goto L_0x05f3
        L_0x061c:
            android.os.Parcelable$Creator r2 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = defpackage.br7.o(r1, r6, r2)
            android.accounts.Account r2 = (android.accounts.Account) r2
            goto L_0x05f3
        L_0x0625:
            int r4 = defpackage.br7.U(r1, r6)
            goto L_0x05f3
        L_0x062a:
            defpackage.br7.s(r1, r0)
            veg r0 = new veg
            r0.<init>(r4, r2, r5, r3)
            return r0
        L_0x0633:
            int r0 = defpackage.br7.d0(r46)
            r2 = -1
            r3 = 0
            r4 = 0
            r5 = 0
            r18 = r2
            r8 = r3
            r9 = r8
            r10 = r9
            r17 = r10
            r15 = r4
            r16 = r15
            r11 = r5
            r13 = r11
        L_0x0648:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x0693
            int r2 = r46.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x068d;
                case 2: goto L_0x0687;
                case 3: goto L_0x0681;
                case 4: goto L_0x067b;
                case 5: goto L_0x0675;
                case 6: goto L_0x066f;
                case 7: goto L_0x0668;
                case 8: goto L_0x0661;
                case 9: goto L_0x065a;
                default: goto L_0x0656;
            }
        L_0x0656:
            defpackage.br7.X(r1, r2)
            goto L_0x0648
        L_0x065a:
            int r2 = defpackage.br7.U(r1, r2)
            r18 = r2
            goto L_0x0648
        L_0x0661:
            int r2 = defpackage.br7.U(r1, r2)
            r17 = r2
            goto L_0x0648
        L_0x0668:
            java.lang.String r2 = defpackage.br7.p(r1, r2)
            r16 = r2
            goto L_0x0648
        L_0x066f:
            java.lang.String r2 = defpackage.br7.p(r1, r2)
            r15 = r2
            goto L_0x0648
        L_0x0675:
            long r2 = defpackage.br7.V(r1, r2)
            r13 = r2
            goto L_0x0648
        L_0x067b:
            long r2 = defpackage.br7.V(r1, r2)
            r11 = r2
            goto L_0x0648
        L_0x0681:
            int r2 = defpackage.br7.U(r1, r2)
            r10 = r2
            goto L_0x0648
        L_0x0687:
            int r2 = defpackage.br7.U(r1, r2)
            r9 = r2
            goto L_0x0648
        L_0x068d:
            int r2 = defpackage.br7.U(r1, r2)
            r8 = r2
            goto L_0x0648
        L_0x0693:
            defpackage.br7.s(r1, r0)
            y99 r0 = new y99
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r13, r15, r16, r17, r18)
            return r0
        L_0x069d:
            int r0 = defpackage.br7.d0(r46)
            r2 = 0
            r3 = 0
            r4 = r3
            r3 = r2
        L_0x06a5:
            int r5 = r46.dataPosition()
            if (r5 >= r0) goto L_0x06d4
            int r5 = r46.readInt()
            char r6 = (char) r5
            r7 = 1
            if (r6 == r7) goto L_0x06cf
            r7 = 2
            if (r6 == r7) goto L_0x06c6
            r7 = 3
            if (r6 == r7) goto L_0x06bd
            defpackage.br7.X(r1, r5)
            goto L_0x06a5
        L_0x06bd:
            android.os.Parcelable$Creator<weg> r3 = defpackage.weg.CREATOR
            android.os.Parcelable r3 = defpackage.br7.o(r1, r5, r3)
            weg r3 = (defpackage.weg) r3
            goto L_0x06a5
        L_0x06c6:
            android.os.Parcelable$Creator<ph3> r2 = defpackage.ph3.CREATOR
            android.os.Parcelable r2 = defpackage.br7.o(r1, r5, r2)
            ph3 r2 = (defpackage.ph3) r2
            goto L_0x06a5
        L_0x06cf:
            int r4 = defpackage.br7.U(r1, r5)
            goto L_0x06a5
        L_0x06d4:
            defpackage.br7.s(r1, r0)
            qeg r0 = new qeg
            r0.<init>(r4, r2, r3)
            return r0
        L_0x06dd:
            int r0 = defpackage.br7.d0(r46)
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x06e4:
            int r5 = r46.dataPosition()
            if (r5 >= r0) goto L_0x0714
            int r5 = r46.readInt()
            char r6 = (char) r5
            r7 = 1
            if (r6 == r7) goto L_0x06fe
            r7 = 2
            if (r6 == r7) goto L_0x06f9
            defpackage.br7.X(r1, r5)
            goto L_0x06e4
        L_0x06f9:
            java.lang.String r4 = defpackage.br7.p(r1, r5)
            goto L_0x06e4
        L_0x06fe:
            int r3 = defpackage.br7.W(r1, r5)
            int r5 = r46.dataPosition()
            if (r3 != 0) goto L_0x070a
            r3 = r2
            goto L_0x06e4
        L_0x070a:
            java.util.ArrayList r6 = r46.createStringArrayList()
            int r5 = r5 + r3
            r1.setDataPosition(r5)
            r3 = r6
            goto L_0x06e4
        L_0x0714:
            defpackage.br7.s(r1, r0)
            leg r0 = new leg
            r0.<init>(r4, r3)
            return r0
        L_0x071d:
            int r0 = defpackage.br7.d0(r46)
            r2 = 0
            r3 = 0
            r6 = r2
            r7 = r6
            r11 = r7
            r12 = r11
            r14 = r12
            r5 = r3
            r8 = r5
            r9 = r8
            r10 = r9
        L_0x072c:
            int r3 = r46.dataPosition()
            if (r3 >= r0) goto L_0x0779
            int r3 = r46.readInt()
            char r4 = (char) r3
            switch(r4) {
                case 1: goto L_0x0774;
                case 2: goto L_0x076d;
                case 3: goto L_0x0763;
                case 4: goto L_0x075e;
                case 5: goto L_0x0759;
                case 6: goto L_0x0754;
                case 7: goto L_0x074f;
                case 8: goto L_0x074a;
                case 9: goto L_0x0743;
                case 10: goto L_0x073e;
                default: goto L_0x073a;
            }
        L_0x073a:
            defpackage.br7.X(r1, r3)
            goto L_0x072c
        L_0x073e:
            java.lang.String r14 = defpackage.br7.p(r1, r3)
            goto L_0x072c
        L_0x0743:
            android.os.Parcelable$Creator<qe6> r2 = defpackage.qe6.CREATOR
            java.util.ArrayList r2 = defpackage.br7.r(r1, r3, r2)
            goto L_0x072c
        L_0x074a:
            java.lang.String r12 = defpackage.br7.p(r1, r3)
            goto L_0x072c
        L_0x074f:
            java.lang.String r11 = defpackage.br7.p(r1, r3)
            goto L_0x072c
        L_0x0754:
            boolean r10 = defpackage.br7.O(r1, r3)
            goto L_0x072c
        L_0x0759:
            boolean r9 = defpackage.br7.O(r1, r3)
            goto L_0x072c
        L_0x075e:
            boolean r8 = defpackage.br7.O(r1, r3)
            goto L_0x072c
        L_0x0763:
            android.os.Parcelable$Creator r4 = android.accounts.Account.CREATOR
            android.os.Parcelable r3 = defpackage.br7.o(r1, r3, r4)
            r7 = r3
            android.accounts.Account r7 = (android.accounts.Account) r7
            goto L_0x072c
        L_0x076d:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r4 = com.google.android.gms.common.api.Scope.CREATOR
            java.util.ArrayList r6 = defpackage.br7.r(r1, r3, r4)
            goto L_0x072c
        L_0x0774:
            int r5 = defpackage.br7.U(r1, r3)
            goto L_0x072c
        L_0x0779:
            defpackage.br7.s(r1, r0)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions
            java.util.HashMap r13 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.c(r2)
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x0787:
            int r0 = defpackage.br7.d0(r46)
            r2 = 0
            r3 = 0
            r5 = 0
            r8 = r2
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r16 = r13
            r17 = r16
            r18 = r17
            r19 = r18
            r14 = r3
            r7 = r5
        L_0x079f:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x0803
            int r2 = r46.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x07fd;
                case 2: goto L_0x07f7;
                case 3: goto L_0x07f1;
                case 4: goto L_0x07eb;
                case 5: goto L_0x07e5;
                case 6: goto L_0x07db;
                case 7: goto L_0x07d5;
                case 8: goto L_0x07cf;
                case 9: goto L_0x07c8;
                case 10: goto L_0x07bf;
                case 11: goto L_0x07b8;
                case 12: goto L_0x07b1;
                default: goto L_0x07ad;
            }
        L_0x07ad:
            defpackage.br7.X(r1, r2)
            goto L_0x079f
        L_0x07b1:
            java.lang.String r2 = defpackage.br7.p(r1, r2)
            r19 = r2
            goto L_0x079f
        L_0x07b8:
            java.lang.String r2 = defpackage.br7.p(r1, r2)
            r18 = r2
            goto L_0x079f
        L_0x07bf:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.util.ArrayList r2 = defpackage.br7.r(r1, r2, r3)
            r17 = r2
            goto L_0x079f
        L_0x07c8:
            java.lang.String r2 = defpackage.br7.p(r1, r2)
            r16 = r2
            goto L_0x079f
        L_0x07cf:
            long r2 = defpackage.br7.V(r1, r2)
            r14 = r2
            goto L_0x079f
        L_0x07d5:
            java.lang.String r2 = defpackage.br7.p(r1, r2)
            r13 = r2
            goto L_0x079f
        L_0x07db:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = defpackage.br7.o(r1, r2, r3)
            android.net.Uri r2 = (android.net.Uri) r2
            r12 = r2
            goto L_0x079f
        L_0x07e5:
            java.lang.String r2 = defpackage.br7.p(r1, r2)
            r11 = r2
            goto L_0x079f
        L_0x07eb:
            java.lang.String r2 = defpackage.br7.p(r1, r2)
            r10 = r2
            goto L_0x079f
        L_0x07f1:
            java.lang.String r2 = defpackage.br7.p(r1, r2)
            r9 = r2
            goto L_0x079f
        L_0x07f7:
            java.lang.String r2 = defpackage.br7.p(r1, r2)
            r8 = r2
            goto L_0x079f
        L_0x07fd:
            int r2 = defpackage.br7.U(r1, r2)
            r7 = r2
            goto L_0x079f
        L_0x0803:
            defpackage.br7.s(r1, r0)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = new com.google.android.gms.auth.api.signin.GoogleSignInAccount
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19)
            return r0
        L_0x080d:
            int r0 = defpackage.br7.d0(r46)
            r2 = 0
            r3 = 0
            r4 = r3
        L_0x0814:
            int r5 = r46.dataPosition()
            if (r5 >= r0) goto L_0x083f
            int r5 = r46.readInt()
            char r6 = (char) r5
            r7 = 1
            if (r6 == r7) goto L_0x083a
            r7 = 2
            if (r6 == r7) goto L_0x0835
            r7 = 3
            if (r6 == r7) goto L_0x082c
            defpackage.br7.X(r1, r5)
            goto L_0x0814
        L_0x082c:
            android.os.Parcelable$Creator r2 = android.content.Intent.CREATOR
            android.os.Parcelable r2 = defpackage.br7.o(r1, r5, r2)
            android.content.Intent r2 = (android.content.Intent) r2
            goto L_0x0814
        L_0x0835:
            int r4 = defpackage.br7.U(r1, r5)
            goto L_0x0814
        L_0x083a:
            int r3 = defpackage.br7.U(r1, r5)
            goto L_0x0814
        L_0x083f:
            defpackage.br7.s(r1, r0)
            edg r0 = new edg
            r0.<init>(r3, r4, r2)
            return r0
        L_0x0848:
            int r0 = defpackage.br7.d0(r46)
            r2 = 0
            r3 = 0
        L_0x084e:
            int r4 = r46.dataPosition()
            if (r4 >= r0) goto L_0x086f
            int r4 = r46.readInt()
            char r5 = (char) r4
            r6 = 1
            if (r5 == r6) goto L_0x086a
            r6 = 2
            if (r5 == r6) goto L_0x0863
            defpackage.br7.X(r1, r4)
            goto L_0x084e
        L_0x0863:
            android.os.Parcelable$Creator<y99> r2 = defpackage.y99.CREATOR
            java.util.ArrayList r2 = defpackage.br7.r(r1, r4, r2)
            goto L_0x084e
        L_0x086a:
            int r3 = defpackage.br7.U(r1, r4)
            goto L_0x084e
        L_0x086f:
            defpackage.br7.s(r1, r0)
            moe r0 = new moe
            r0.<init>(r3, r2)
            return r0
        L_0x0878:
            int r0 = defpackage.br7.d0(r46)
            r2 = 0
            r3 = 0
        L_0x087e:
            int r4 = r46.dataPosition()
            if (r4 >= r0) goto L_0x089d
            int r4 = r46.readInt()
            char r5 = (char) r4
            r6 = 1
            if (r5 == r6) goto L_0x0898
            r6 = 2
            if (r5 == r6) goto L_0x0893
            defpackage.br7.X(r1, r4)
            goto L_0x087e
        L_0x0893:
            java.lang.String r2 = defpackage.br7.p(r1, r4)
            goto L_0x087e
        L_0x0898:
            int r3 = defpackage.br7.U(r1, r4)
            goto L_0x087e
        L_0x089d:
            defpackage.br7.s(r1, r0)
            m33 r0 = new m33
            r0.<init>(r3, r2)
            return r0
        L_0x08a6:
            int r0 = defpackage.br7.d0(r46)
            r2 = 0
            r3 = 0
            r4 = r3
        L_0x08ad:
            int r5 = r46.dataPosition()
            if (r5 >= r0) goto L_0x08d4
            int r5 = r46.readInt()
            char r6 = (char) r5
            r7 = 1
            if (r6 == r7) goto L_0x08cf
            r7 = 2
            if (r6 == r7) goto L_0x08ca
            r7 = 3
            if (r6 == r7) goto L_0x08c5
            defpackage.br7.X(r1, r5)
            goto L_0x08ad
        L_0x08c5:
            android.os.Bundle r2 = defpackage.br7.n(r1, r5)
            goto L_0x08ad
        L_0x08ca:
            int r4 = defpackage.br7.U(r1, r5)
            goto L_0x08ad
        L_0x08cf:
            int r3 = defpackage.br7.U(r1, r5)
            goto L_0x08ad
        L_0x08d4:
            defpackage.br7.s(r1, r0)
            qe6 r0 = new qe6
            r0.<init>(r3, r4, r2)
            return r0
        L_0x08dd:
            zqf r0 = new zqf
            r0.<init>(r1)
            return r0
        L_0x08e3:
            yqf r0 = new yqf
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqf.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new yqf[i];
            case 1:
                return new zqf[i];
            case 2:
                return new qe6[i];
            case 3:
                return new m33[i];
            case 4:
                return new moe[i];
            case 5:
                return new edg[i];
            case 6:
                return new GoogleSignInAccount[i];
            case 7:
                return new GoogleSignInOptions[i];
            case 8:
                return new leg[i];
            case 9:
                return new qeg[i];
            case 10:
                return new y99[i];
            case 11:
                return new veg[i];
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new weg[i];
            case 13:
                return new CameraPosition[i];
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new r43[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new Scope[i];
            case 16:
                return new yd7[i];
            case LangUtils.HASH_SEED /*17*/:
                return new LocationAvailability[i];
            case 18:
                return new GoogleMapOptions[i];
            case 19:
                return new mae[i];
            case 20:
                return new pae[i];
            case 21:
                return new LocationRequest[i];
            case 22:
                return new LocationResult[i];
            case 23:
                return new qr7[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new rr7[i];
            case 25:
                return new sr7[i];
            case 26:
                return new xmc[i];
            case 27:
                return new nfg[i];
            case 28:
                return new ez1[i];
            default:
                return new hkc[i];
        }
    }
}
