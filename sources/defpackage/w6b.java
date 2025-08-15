package defpackage;

import java.util.Arrays;

/* renamed from: w6b  reason: default package */
public final class w6b {
    public final CharSequence a;
    public final String[] b;

    public w6b(CharSequence charSequence, String[] strArr) {
        this.a = charSequence;
        this.b = strArr;
    }

    public static w6b a() {
        return new w6b("", new String[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6b)) {
            return false;
        }
        w6b w6b = (w6b) obj;
        if (!this.a.equals(w6b.a)) {
            return false;
        }
        return Arrays.equals(this.b, w6b.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreProcessedText{text=");
        sb.append(pag.x(this.a));
        sb.append(", tokens=");
        return au1.h(sb, this.b.length, '}');
    }
}
