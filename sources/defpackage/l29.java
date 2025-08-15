package defpackage;

import java.util.ArrayList;
import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* renamed from: l29  reason: default package */
public final class l29 implements q29 {
    public static final l29 o = new l29(nz4.a, true, true);
    public final List a;
    public final boolean b;
    public final boolean c;

    public l29(List list, boolean z, boolean z2) {
        this.a = list;
        this.b = z;
        this.c = z2;
    }

    public static String a(MessageModel messageModel) {
        if (messageModel == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("MessageModel(messageId=");
        sb.append(messageModel.a);
        sb.append(", serverId=");
        sb.append(messageModel.b);
        sb.append(", sortTime=");
        return zr6.k(sb, messageModel.c, ")");
    }

    public final List b() {
        return this.a;
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        for (Object next : this.a) {
            if (((MessageModel) next).Z == zof.Error) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l29)) {
            return false;
        }
        l29 l29 = (l29) obj;
        return tpa.f(this.a, l29.a) && this.b == l29.b && this.c == l29.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ms2.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        List list = this.a;
        int size = list.size();
        String a2 = a((MessageModel) x53.i0(list));
        String a3 = a((MessageModel) x53.q0(list));
        return x9e.b0("\n        MessagesList(\n            hasNext=" + this.b + ",\n            hasPrev=" + this.c + ",\n            messages=Messages(size=" + size + ", first=" + a2 + ", last=" + a3 + ")\n        ) \n        ");
    }
}
