package one.me.messages.list.loader;

import android.text.Layout;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lone/me/messages/list/loader/MessageModel;", "Lvk6;", "Lol7;", "pw8", "ow8", "Companion", "message-list_release"}, k = 1, mv = {2, 0, 0})
public final class MessageModel implements vk6, ol7 {
    public static final Companion J0 = new Object();
    public final int A0;
    public final ix8 B0;
    public final long C0;
    public final boolean D0;
    public final iu8 E0;
    public Layout F0;
    public Layout G0;
    public ow8 H0;
    public int I0;
    public final CharSequence X;
    public final CharSequence Y;
    public final zof Z;
    public final long a;
    public final long b;
    public final long c;
    public final CharSequence o;
    public final boolean s0;
    public final boolean t0;
    public final tz u0;
    public final boolean v0;
    public final by8 w0;
    public final cw8 x0;
    public final pw8 y0;
    public final tc9 z0;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lone/me/messages/list/loader/MessageModel$Companion;", "", "", "displayText", "", "pinId", "Lone/me/messages/list/loader/MessageModel;", "control", "(Ljava/lang/CharSequence;J)Lone/me/messages/list/loader/MessageModel;", "message-list_release"}, k = 1, mv = {2, 0, 0})
    public static final class Companion {
        @Keep
        public final MessageModel control(CharSequence charSequence, long j) {
            tz tzVar = tz.f;
            iu8 iu8 = iu8.SENT;
            pw8 pw8 = r0;
            pw8 pw82 = new pw8(j);
            return new MessageModel(0, 0, 0, charSequence, "", "", zof.None, false, false, tzVar, false, (by8) null, (cw8) null, pw8, (tc9) null, 2, (ix8) null, 0, true, iu8, (ow8) null, 0, 6315008);
        }
    }

    public MessageModel(long j, long j2, long j3, CharSequence charSequence, String str, CharSequence charSequence2, zof zof, boolean z, boolean z2, tz tzVar, boolean z3, by8 by8, cw8 cw8, pw8 pw8, tc9 tc9, int i, ix8 ix8, long j4, boolean z4, iu8 iu8, ow8 ow8, int i2, int i3) {
        int i4 = i3;
        boolean z5 = (i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? false : z3;
        by8 by82 = (i4 & 2048) != 0 ? null : by8;
        cw8 cw82 = (i4 & 4096) != 0 ? null : cw8;
        pw8 pw82 = (i4 & 8192) != 0 ? null : pw8;
        tc9 tc92 = (i4 & 16384) != 0 ? null : tc9;
        ow8 ow82 = (4194304 & i4) != 0 ? null : ow8;
        int i5 = (i4 & 8388608) != 0 ? -1 : i2;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = charSequence;
        this.X = str;
        this.Y = charSequence2;
        this.Z = zof;
        this.s0 = z;
        this.t0 = z2;
        this.u0 = tzVar;
        this.v0 = z5;
        this.w0 = by82;
        this.x0 = cw82;
        this.y0 = pw82;
        this.z0 = tc92;
        this.A0 = i;
        this.B0 = ix8;
        this.C0 = j4;
        this.D0 = z4;
        this.E0 = iu8;
        this.F0 = null;
        this.G0 = null;
        this.H0 = ow82;
        this.I0 = i5;
    }

    @Keep
    public static final MessageModel control(CharSequence charSequence, long j) {
        return J0.control(charSequence, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageModel)) {
            return false;
        }
        MessageModel messageModel = (MessageModel) obj;
        return this.a == messageModel.a && this.b == messageModel.b && this.c == messageModel.c && tpa.f(this.o, messageModel.o) && tpa.f(this.X, messageModel.X) && tpa.f(this.Y, messageModel.Y) && this.Z == messageModel.Z && this.s0 == messageModel.s0 && this.t0 == messageModel.t0 && tpa.f(this.u0, messageModel.u0) && this.v0 == messageModel.v0 && tpa.f(this.w0, messageModel.w0) && tpa.f(this.x0, messageModel.x0) && tpa.f(this.y0, messageModel.y0) && tpa.f(this.z0, messageModel.z0) && this.A0 == messageModel.A0 && tpa.f(this.B0, messageModel.B0) && this.C0 == messageModel.C0 && this.D0 == messageModel.D0 && this.E0 == messageModel.E0 && tpa.f(this.F0, messageModel.F0) && tpa.f(this.G0, messageModel.G0) && tpa.f(this.H0, messageModel.H0) && ry8.a(this.I0, messageModel.I0);
    }

    public final long getId() {
        return this.a;
    }

    public final long getItemId() {
        return this.a;
    }

    public final boolean h(ol7 ol7) {
        return this.a == ol7.getItemId();
    }

    public final int hashCode() {
        int d = ms2.d((this.u0.hashCode() + ms2.d(ms2.d((this.Z.hashCode() + rh4.f(this.Y, rh4.f(this.X, rh4.f(this.o, h4f.m(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31), 31)) * 31, 31, this.s0), 31, this.t0)) * 31, 31, this.v0);
        int i = 0;
        by8 by8 = this.w0;
        int hashCode = (d + (by8 == null ? 0 : by8.hashCode())) * 31;
        cw8 cw8 = this.x0;
        int hashCode2 = (hashCode + (cw8 == null ? 0 : cw8.hashCode())) * 31;
        pw8 pw8 = this.y0;
        int hashCode3 = (hashCode2 + (pw8 == null ? 0 : Long.hashCode(pw8.a))) * 31;
        tc9 tc9 = this.z0;
        int g = ey8.g(this.A0, (hashCode3 + (tc9 == null ? 0 : tc9.hashCode())) * 31, 31);
        ix8 ix8 = this.B0;
        int hashCode4 = (this.E0.hashCode() + ms2.d(h4f.m((g + (ix8 == null ? 0 : ix8.hashCode())) * 31, 31, this.C0), 31, this.D0)) * 31;
        Layout layout = this.F0;
        int hashCode5 = (hashCode4 + (layout == null ? 0 : layout.hashCode())) * 31;
        Layout layout2 = this.G0;
        int hashCode6 = (hashCode5 + (layout2 == null ? 0 : layout2.hashCode())) * 31;
        ow8 ow8 = this.H0;
        if (ow8 != null) {
            i = ow8.hashCode();
        }
        return Integer.hashCode(this.I0) + ((hashCode6 + i) * 31);
    }

    public final long k() {
        return this.c;
    }

    public final int l() {
        return this.I0;
    }

    public final String m() {
        String e = ry8.e(this.I0);
        StringBuilder sb = new StringBuilder("\n        MessageModel(mid=");
        sb.append(this.a);
        sb.append(", sid=");
        sb.append(this.b);
        sb.append(" time=");
        ms2.j(this.c, " viewType=", e, sb);
        sb.append(")\n    ");
        return x9e.b0(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(java.lang.Object r15) {
        /*
            r14 = this;
            ol7 r15 = (defpackage.ol7) r15
            boolean r0 = r15 instanceof one.me.messages.list.loader.MessageModel
            if (r0 != 0) goto L_0x0009
            r14 = 0
            goto L_0x0082
        L_0x0009:
            tz r0 = r14.u0
            z07 r1 = r0.e
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x001a
            r4 = r15
            one.me.messages.list.loader.MessageModel r4 = (one.me.messages.list.loader.MessageModel) r4
            tz r4 = r4.u0
            z07 r4 = r4.e
            if (r4 != 0) goto L_0x002b
        L_0x001a:
            if (r1 == 0) goto L_0x0028
            r4 = r15
            one.me.messages.list.loader.MessageModel r4 = (one.me.messages.list.loader.MessageModel) r4
            tz r4 = r4.u0
            z07 r4 = r4.e
            boolean r1 = r1.a(r4)
            goto L_0x0029
        L_0x0028:
            r1 = r3
        L_0x0029:
            if (r1 != 0) goto L_0x002d
        L_0x002b:
            r13 = r3
            goto L_0x002e
        L_0x002d:
            r13 = r2
        L_0x002e:
            android.text.Layout r1 = r14.F0
            one.me.messages.list.loader.MessageModel r15 = (one.me.messages.list.loader.MessageModel) r15
            android.text.Layout r4 = r15.F0
            boolean r1 = defpackage.tpa.f(r1, r4)
            r5 = r1 ^ 1
            android.text.Layout r1 = r14.G0
            android.text.Layout r4 = r15.G0
            boolean r1 = defpackage.tpa.f(r1, r4)
            r6 = r1 ^ 1
            zof r1 = r14.Z
            zof r4 = r15.Z
            if (r1 == r4) goto L_0x004c
            r8 = r3
            goto L_0x004d
        L_0x004c:
            r8 = r2
        L_0x004d:
            java.lang.CharSequence r1 = r14.X
            java.lang.CharSequence r4 = r15.X
            boolean r1 = defpackage.tpa.f(r1, r4)
            r7 = r1 ^ 1
            by8 r1 = r14.w0
            by8 r4 = r15.w0
            boolean r1 = defpackage.tpa.f(r1, r4)
            r9 = r1 ^ 1
            ix8 r1 = r14.B0
            ix8 r4 = r15.B0
            boolean r1 = defpackage.tpa.f(r1, r4)
            r10 = r1 ^ 1
            boolean r14 = r14.v0
            boolean r1 = r15.v0
            if (r14 == r1) goto L_0x0073
            r11 = r3
            goto L_0x0074
        L_0x0073:
            r11 = r2
        L_0x0074:
            tz r14 = r15.u0
            boolean r14 = r0.equals(r14)
            r12 = r14 ^ 1
            zw8 r14 = new zw8
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0082:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.messages.list.loader.MessageModel.n(java.lang.Object):java.lang.Object");
    }

    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        Layout layout = this.F0;
        Layout layout2 = this.G0;
        ow8 ow8 = this.H0;
        String e = ry8.e(this.I0);
        StringBuilder sb = new StringBuilder("MessageModel(messageId=");
        sb.append(this.a);
        sb.append(", serverId=");
        sb.append(this.b);
        sb.append(", sortTime=");
        sb.append(this.c);
        sb.append(", displayText=");
        sb.append(this.o);
        sb.append(", displayTime=");
        sb.append(this.X);
        sb.append(", decorTime=");
        sb.append(this.Y);
        sb.append(", viewStatus=");
        sb.append(this.Z);
        sb.append(", drawBackground=");
        sb.append(this.s0);
        sb.append(", needCorners=");
        sb.append(this.t0);
        sb.append(", attachInfo=");
        sb.append(this.u0);
        sb.append(", isEdit=");
        sb.append(this.v0);
        sb.append(", messageTextStaticLayout=");
        sb.append(this.w0);
        sb.append(", messageLink=");
        sb.append(this.x0);
        sb.append(", controlInfo=");
        sb.append(this.y0);
        sb.append(", widgetState=");
        sb.append(this.z0);
        sb.append(", chatType=");
        int i = this.A0;
        sb.append(i != 1 ? i != 2 ? "null" : "CHAT" : "DIALOG");
        sb.append(", reactionsData=");
        sb.append(this.B0);
        sb.append(", senderId=");
        sb.append(this.C0);
        sb.append(", isIncoming=");
        sb.append(this.D0);
        sb.append(", deliveryStatus=");
        sb.append(this.E0);
        sb.append(", sender=");
        sb.append(layout);
        sb.append(", alias=");
        sb.append(layout2);
        sb.append(", avatarParams=");
        sb.append(ow8);
        sb.append(", messageViewType=");
        return zr6.l(sb, e, ")");
    }
}
