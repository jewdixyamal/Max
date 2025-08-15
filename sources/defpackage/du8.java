package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import ru.ok.tamtam.nano.b;

/* renamed from: du8  reason: default package */
public final class du8 implements Parcelable {
    public static final Parcelable.Creator<du8> CREATOR = new uk7(17);
    public final cu8 a;

    public du8(cu8 cu8) {
        this.a = cu8;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte b = 1;
        cu8 cu8 = this.a;
        parcel.writeByte(cu8 == null ? (byte) 1 : 0);
        if (cu8 != null) {
            parcel.writeLong(cu8.b);
            parcel.writeLong(cu8.c);
            parcel.writeLong(cu8.o);
            parcel.writeLong(cu8.X);
            parcel.writeLong(cu8.Y);
            parcel.writeLong(cu8.Z);
            f8.H(parcel, cu8.s0);
            parcel.writeLong(cu8.t0);
            parcel.writeInt(cu8.u0.a);
            parcel.writeInt(cu8.v0.a);
            parcel.writeLong(cu8.w0);
            f8.H(parcel, cu8.x0);
            f8.H(parcel, cu8.y0);
            byte[] bArr = null;
            k8g k8g = cu8.z0;
            byte[] byteArray = k8g != null ? qw8.toByteArray(b.f(k8g)) : null;
            byte b2 = byteArray != null ? (byte) 1 : 0;
            parcel.writeByte(b2);
            if (b2 != 0) {
                parcel.writeInt(byteArray.length);
                parcel.writeByteArray(byteArray);
            }
            parcel.writeInt(cu8.F0);
            parcel.writeLong(cu8.B0);
            parcel.writeInt(cu8.A0);
            parcel.writeParcelable(new du8(cu8.C0), 0);
            parcel.writeString(cu8.D0);
            parcel.writeString(cu8.E0);
            parcel.writeByte(cu8.G0 ? (byte) 1 : 0);
            parcel.writeInt(cu8.H0);
            parcel.writeInt(cu8.I0);
            parcel.writeInt(ey8.e(cu8.V0));
            parcel.writeLong(cu8.J0);
            parcel.writeLong(cu8.K0);
            parcel.writeParcelable(new du8(cu8.L0), 0);
            parcel.writeInt(cu8.M0);
            parcel.writeLong(cu8.N0);
            parcel.writeInt(cu8.O0);
            parcel.writeInt(cu8.P0);
            parcel.writeLong(cu8.Q0);
            List list = cu8.R0;
            if (list != null) {
                bArr = ou8.b(list);
            }
            if (bArr == null) {
                b = 0;
            }
            parcel.writeByte(b);
            if (b != 0) {
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(bArr);
            }
            parcel.writeByte(cu8.o() ? (byte) 1 : 0);
            if (cu8.o()) {
                ng4 ng4 = cu8.T0;
                parcel.writeLong(ng4.a);
                parcel.writeByte(ng4.b ? (byte) 1 : 0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00e2 A[SYNTHETIC, Splitter:B:21:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public du8(android.os.Parcel r57) {
        /*
            r56 = this;
            r0 = r56
            r1 = r57
            r2 = 1
            r56.<init>()
            boolean r3 = defpackage.f8.w(r57)
            if (r3 != 0) goto L_0x0178
            long r6 = r57.readLong()
            long r8 = r57.readLong()
            long r12 = r57.readLong()
            long r14 = r57.readLong()
            long r16 = r57.readLong()
            long r18 = r57.readLong()
            java.lang.String r20 = defpackage.f8.x(r57)
            long r10 = r57.readLong()
            int r3 = r57.readInt()
            int r5 = r57.readInt()
            long r23 = r57.readLong()
            java.lang.String r25 = defpackage.f8.x(r57)
            java.lang.String r26 = defpackage.f8.x(r57)
            byte r4 = r57.readByte()
            if (r4 != r2) goto L_0x0052
            int r4 = r57.readInt()
            byte[] r4 = new byte[r4]
            r1.readByteArray(r4)
            goto L_0x0053
        L_0x0052:
            r4 = 0
        L_0x0053:
            k8g r27 = defpackage.iz7.b(r4)
            int r28 = r57.readInt()
            int r29 = r57.readInt()
            long r30 = r57.readLong()
            java.lang.Class<du8> r4 = defpackage.du8.class
            java.lang.ClassLoader r2 = r4.getClassLoader()
            android.os.Parcelable r2 = r1.readParcelable(r2)
            du8 r2 = (defpackage.du8) r2
            java.lang.String r33 = r57.readString()
            java.lang.String r34 = r57.readString()
            byte r0 = r57.readByte()
            r35 = r14
            r15 = 1
            if (r0 != r15) goto L_0x0082
            r0 = 1
            goto L_0x0083
        L_0x0082:
            r0 = 0
        L_0x0083:
            int r37 = r57.readInt()
            int r39 = r57.readInt()
            int r15 = r57.readInt()
            long r40 = r57.readLong()
            long r44 = r57.readLong()
            java.lang.ClassLoader r4 = r4.getClassLoader()
            android.os.Parcelable r4 = r1.readParcelable(r4)
            du8 r4 = (defpackage.du8) r4
            int r46 = r57.readInt()
            long r47 = r57.readLong()
            int r49 = r57.readInt()
            int r50 = r57.readInt()
            long r51 = r57.readLong()
            byte r14 = r57.readByte()
            r42 = r0
            r0 = 1
            if (r14 != r0) goto L_0x00c8
            int r0 = r57.readInt()
            byte[] r0 = new byte[r0]
            r1.readByteArray(r0)
            goto L_0x00c9
        L_0x00c8:
            r0 = 0
        L_0x00c9:
            if (r0 == 0) goto L_0x00da
            ru.ok.tamtam.nano.Protos$MessageElements r14 = new ru.ok.tamtam.nano.Protos$MessageElements     // Catch:{ Exception -> 0x00da }
            r14.<init>()     // Catch:{ Exception -> 0x00da }
            defpackage.qw8.mergeFrom(r14, r0)     // Catch:{ Exception -> 0x00da }
            ru.ok.tamtam.nano.Protos$MessageElement[] r0 = r14.elements     // Catch:{ Exception -> 0x00da }
            java.util.ArrayList r0 = defpackage.ou8.a(r0)     // Catch:{ Exception -> 0x00da }
            goto L_0x00db
        L_0x00da:
            r0 = 0
        L_0x00db:
            byte r14 = r57.readByte()
            r1 = 1
            if (r14 != r1) goto L_0x0100
            ng4 r14 = new ng4     // Catch:{ Exception -> 0x0100 }
            r38 = r2
            long r1 = r57.readLong()     // Catch:{ Exception -> 0x00fd }
            r53 = r0
            byte r0 = r57.readByte()     // Catch:{ Exception -> 0x0104 }
            r54 = r12
            r12 = 1
            if (r0 != r12) goto L_0x00f7
            r0 = 1
            goto L_0x00f8
        L_0x00f7:
            r0 = 0
        L_0x00f8:
            r14.<init>(r1, r0)     // Catch:{ Exception -> 0x0106 }
            r0 = r14
            goto L_0x0107
        L_0x00fd:
            r53 = r0
            goto L_0x0104
        L_0x0100:
            r53 = r0
            r38 = r2
        L_0x0104:
            r54 = r12
        L_0x0106:
            r0 = 0
        L_0x0107:
            ix8 r1 = new ix8
            java.util.List r2 = java.util.Collections.emptyList()
            r12 = 0
            r13 = 0
            r1.<init>(r2, r13, r12)
            cu8 r2 = new cu8
            oz7 r12 = defpackage.iu8.b
            r12.getClass()
            iu8 r21 = defpackage.oz7.n(r3)
            vx8[] r3 = defpackage.vx8.values()
            int r12 = r3.length
            r14 = r13
        L_0x0123:
            if (r14 >= r12) goto L_0x0170
            r13 = r3[r14]
            r57 = r3
            int r3 = r13.a
            if (r3 != r5) goto L_0x0165
            r3 = r38
            cu8 r3 = r3.a
            r32 = r3
            int r38 = defpackage.ey8.a(r15)
            cu8 r3 = r4.a
            r43 = r3
            r5 = r2
            r3 = r13
            r12 = r54
            r14 = r35
            r22 = r3
            r35 = r42
            r36 = r37
            r37 = r39
            r39 = r40
            r41 = r44
            r44 = r46
            r45 = r47
            r47 = r49
            r48 = r50
            r49 = r51
            r51 = r53
            r52 = r1
            r53 = r0
            r5.<init>(r6, r8, r10, r12, r14, r16, r18, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r36, r37, r38, r39, r41, r43, r44, r45, r47, r48, r49, r51, r52, r53)
            r13 = r56
            r13.a = r2
            goto L_0x017c
        L_0x0165:
            r13 = r56
            r3 = r38
            r22 = 1
            int r14 = r14 + 1
            r3 = r57
            goto L_0x0123
        L_0x0170:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Array contains no element matching the predicate."
            r0.<init>(r1)
            throw r0
        L_0x0178:
            r13 = r0
            r0 = 0
            r13.a = r0
        L_0x017c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.du8.<init>(android.os.Parcel):void");
    }
}
