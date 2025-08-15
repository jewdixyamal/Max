package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: wgc  reason: default package */
public final class wgc {
    public final List a;
    public final boolean b;

    public wgc(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgc)) {
            return false;
        }
        wgc wgc = (wgc) obj;
        return tpa.f(this.a, wgc.a) && this.b == wgc.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReplyKeyboard(buttons=" + this.a + ", defaultInputDisabled=" + this.b + ")";
    }
}
