package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: v48  reason: default package */
public final class v48 implements c58 {
    public final CharSequence a;
    public final List b;
    public final boolean c;

    public v48(CharSequence charSequence, ArrayList arrayList, boolean z) {
        this.a = charSequence;
        this.b = arrayList;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v48)) {
            return false;
        }
        v48 v48 = (v48) obj;
        return tpa.f(this.a, v48.a) && tpa.f(this.b, v48.b) && this.c == v48.c;
    }

    public final int hashCode() {
        int i = 0;
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        List list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return Boolean.hashCode(this.c) + ((hashCode + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinishEditMessage(text=");
        sb.append(this.a);
        sb.append(", media=");
        sb.append(this.b);
        sb.append(", mediaChanged=");
        return au1.j(sb, this.c, ")");
    }
}
