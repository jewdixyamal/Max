package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;

/* renamed from: lhg  reason: default package */
public final class lhg extends n3 {
    public static final Parcelable.Creator<lhg> CREATOR = new ufg(8);
    public final LocationRequest a;

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public lhg(com.google.android.gms.location.LocationRequest r31, java.util.ArrayList r32, boolean r33, boolean r34, boolean r35, boolean r36, long r37) {
        /*
            r30 = this;
            r0 = r31
            r30.<init>()
            int r1 = r0.a
            long r2 = r0.b
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0011
            r6 = 1
            goto L_0x0012
        L_0x0011:
            r6 = 0
        L_0x0012:
            java.lang.String r9 = "intervalMillis must be greater than or equal to 0"
            defpackage.fp3.g(r9, r6)
            defpackage.ay7.U(r1)
            long r9 = r0.c
            r11 = -1
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x0026
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0028
        L_0x0026:
            r6 = 1
            goto L_0x0029
        L_0x0028:
            r6 = 0
        L_0x0029:
            java.lang.String r13 = "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL"
            defpackage.fp3.g(r13, r6)
            long r13 = r0.o
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0036
            r6 = 1
            goto L_0x0037
        L_0x0036:
            r6 = 0
        L_0x0037:
            java.lang.String r15 = "maxUpdateDelayMillis must be greater than or equal to 0"
            defpackage.fp3.g(r15, r6)
            r15 = r9
            long r8 = r0.X
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x0045
            r10 = 1
            goto L_0x0046
        L_0x0045:
            r10 = 0
        L_0x0046:
            java.lang.String r6 = "durationMillis must be greater than 0"
            defpackage.fp3.g(r6, r10)
            int r10 = r0.Y
            if (r10 <= 0) goto L_0x0051
            r6 = 1
            goto L_0x0052
        L_0x0051:
            r6 = 0
        L_0x0052:
            java.lang.String r7 = "maxUpdates must be greater than 0"
            defpackage.fp3.g(r7, r6)
            float r7 = r0.Z
            r6 = 0
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0060
            r6 = 1
            goto L_0x0061
        L_0x0060:
            r6 = 0
        L_0x0061:
            java.lang.String r4 = "minUpdateDistanceMeters must be greater than or equal to 0"
            defpackage.fp3.g(r4, r6)
            boolean r4 = r0.s0
            long r5 = r0.t0
            int r21 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r21 == 0) goto L_0x0074
            r19 = 0
            int r21 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r21 < 0) goto L_0x0076
        L_0x0074:
            r11 = 1
            goto L_0x0077
        L_0x0076:
            r11 = 0
        L_0x0077:
            java.lang.String r12 = "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE"
            defpackage.fp3.g(r12, r11)
            int r11 = r0.u0
            if (r11 == 0) goto L_0x0099
            r22 = r4
            r4 = 1
            if (r11 == r4) goto L_0x0093
            r4 = r5
            r6 = 2
            if (r11 != r6) goto L_0x008e
            r23 = r4
            r4 = 1
            r6 = 2
            goto L_0x009c
        L_0x008e:
            r23 = r4
            r6 = r11
            r4 = 0
            goto L_0x009c
        L_0x0093:
            r4 = r5
            r23 = r4
            r6 = r11
            r4 = 1
            goto L_0x009c
        L_0x0099:
            r22 = r4
            goto L_0x0093
        L_0x009c:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r6 = "granularity %d must be a Granularity.GRANULARITY_* constant"
            defpackage.fp3.h(r4, r6, r5)
            int r6 = r0.v0
            if (r6 == 0) goto L_0x00be
            r4 = 1
            if (r6 == r4) goto L_0x00ba
            r5 = 2
            if (r6 != r5) goto L_0x00b6
            r17 = r5
            goto L_0x00c0
        L_0x00b6:
            r17 = r6
            r4 = 0
            goto L_0x00c0
        L_0x00ba:
            r5 = 2
            r17 = r6
            goto L_0x00c0
        L_0x00be:
            r4 = 1
            goto L_0x00ba
        L_0x00c0:
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)
            java.lang.Object[] r5 = new java.lang.Object[]{r17}
            r17 = r6
            java.lang.String r6 = "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant"
            defpackage.fp3.h(r4, r6, r5)
            ghg r6 = r0.y0
            if (r6 == 0) goto L_0x00de
            ghg r4 = r6.Y
            if (r4 != 0) goto L_0x00d8
            goto L_0x00de
        L_0x00d8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x00de:
            if (r32 == 0) goto L_0x0111
            boolean r4 = r32.isEmpty()
            if (r4 == 0) goto L_0x00ea
            r4 = 0
        L_0x00e7:
            r26 = r6
            goto L_0x0115
        L_0x00ea:
            android.os.WorkSource r4 = new android.os.WorkSource
            r4.<init>()
            java.util.Iterator r5 = r32.iterator()
        L_0x00f3:
            boolean r26 = r5.hasNext()
            if (r26 == 0) goto L_0x00e7
            java.lang.Object r26 = r5.next()
            r32 = r5
            r5 = r26
            m33 r5 = (defpackage.m33) r5
            r26 = r6
            int r6 = r5.a
            java.lang.String r5 = r5.b
            defpackage.e8g.a(r4, r6, r5)
            r5 = r32
            r6 = r26
            goto L_0x00f3
        L_0x0111:
            r26 = r6
            android.os.WorkSource r4 = r0.x0
        L_0x0115:
            if (r33 == 0) goto L_0x011a
            r27 = 1
            goto L_0x011c
        L_0x011a:
            r27 = r11
        L_0x011c:
            if (r34 == 0) goto L_0x0121
            r25 = 2
            goto L_0x0123
        L_0x0121:
            r25 = r17
        L_0x0123:
            if (r35 == 0) goto L_0x0128
            r28 = 1
            goto L_0x012c
        L_0x0128:
            boolean r0 = r0.w0
            r28 = r0
        L_0x012c:
            if (r36 == 0) goto L_0x0130
            r22 = 1
        L_0x0130:
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r37 > r5 ? 1 : (r37 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x014d
            r5 = -1
            int r0 = (r37 > r5 ? 1 : (r37 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0145
            r5 = 0
            int r0 = (r37 > r5 ? 1 : (r37 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0147
        L_0x0145:
            r0 = 1
            goto L_0x0148
        L_0x0147:
            r0 = 0
        L_0x0148:
            defpackage.fp3.g(r12, r0)
            r23 = r37
        L_0x014d:
            com.google.android.gms.location.LocationRequest r12 = new com.google.android.gms.location.LocationRequest
            r5 = -1
            int r0 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0157
            r15 = r2
            goto L_0x0162
        L_0x0157:
            r0 = 105(0x69, float:1.47E-43)
            if (r1 != r0) goto L_0x015c
            goto L_0x0162
        L_0x015c:
            r5 = r15
            long r5 = java.lang.Math.min(r5, r2)
            r15 = r5
        L_0x0162:
            long r13 = java.lang.Math.max(r13, r2)
            r5 = -1
            int r0 = (r23 > r5 ? 1 : (r23 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x016e
            r23 = r2
        L_0x016e:
            android.os.WorkSource r0 = new android.os.WorkSource
            r20 = r0
            r0.<init>(r4)
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r17 = r8
            r8 = r4
            r0 = r12
            r4 = r15
            r15 = r7
            r21 = r26
            r6 = r13
            r13 = r10
            r10 = r17
            r14 = r12
            r12 = r13
            r13 = r15
            r15 = r14
            r14 = r22
            r29 = r15
            r15 = r23
            r17 = r27
            r18 = r25
            r19 = r28
            r0.<init>(r1, r2, r4, r6, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21)
            r0 = r30
            r1 = r29
            r0.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lhg.<init>(com.google.android.gms.location.LocationRequest, java.util.ArrayList, boolean, boolean, boolean, boolean, long):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lhg) {
            return s36.l(this.a, ((lhg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int T = ay7.T(parcel, 20293);
        ay7.P(parcel, 1, this.a, i);
        ay7.W(parcel, T);
    }
}
