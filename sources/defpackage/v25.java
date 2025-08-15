package defpackage;

import java.io.Serializable;

/* renamed from: v25  reason: default package */
public final class v25 extends x1 implements u25, Serializable {
    public final Enum[] a;

    public v25(Enum[] enumArr) {
        this.a = enumArr;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum enumR = (Enum) obj;
        return ((Enum) ys.f0(enumR.ordinal(), this.a)) == enumR;
    }

    public final Object get(int i) {
        Enum[] enumArr = this.a;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        throw new IndexOutOfBoundsException(rh4.h("index: ", i, length, ", size: "));
    }

    public final int getSize() {
        return this.a.length;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum enumR = (Enum) obj;
        int ordinal = enumR.ordinal();
        if (((Enum) ys.f0(ordinal, this.a)) == enumR) {
            return ordinal;
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return indexOf((Enum) obj);
    }
}
