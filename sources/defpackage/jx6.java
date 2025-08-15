package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: jx6  reason: default package */
public abstract class jx6 extends qw6 implements Set {
    public static final /* synthetic */ int c = 0;
    public transient zw6 b;

    public static int h(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        if (z) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static jx6 i(int i, Object... objArr) {
        if (i == 0) {
            return lfc.u0;
        }
        if (i != 1) {
            int h = h(i);
            Object[] objArr2 = new Object[h];
            int i2 = h - 1;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < i) {
                Object obj = objArr[i3];
                if (obj != null) {
                    int hashCode = obj.hashCode();
                    int z = xfg.z(hashCode);
                    while (true) {
                        int i6 = z & i2;
                        Object obj2 = objArr2[i6];
                        if (obj2 == null) {
                            objArr[i5] = obj;
                            objArr2[i6] = obj;
                            i4 += hashCode;
                            i5++;
                            break;
                        } else if (obj2.equals(obj)) {
                            break;
                        } else {
                            z++;
                        }
                    }
                    i3++;
                } else {
                    throw new NullPointerException(zr6.h(i3, "at index "));
                }
            }
            Arrays.fill(objArr, i5, i, (Object) null);
            if (i5 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                return new jsd(obj3);
            } else if (h(i5) < h / 2) {
                return i(i5, objArr);
            } else {
                int length = objArr.length;
                if (i5 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i5);
                }
                return new lfc(i4, i2, i5, objArr, objArr2);
            }
        } else {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new jsd(obj4);
        }
    }

    public static jx6 j(Collection collection) {
        if ((collection instanceof jx6) && !(collection instanceof SortedSet)) {
            jx6 jx6 = (jx6) collection;
            if (!jx6.f()) {
                return jx6;
            }
        }
        Object[] array = collection.toArray();
        return i(array.length, array);
    }

    public zw6 a() {
        zw6 zw6 = this.b;
        if (zw6 != null) {
            return zw6;
        }
        zw6 k = k();
        this.b = k;
        return k;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jx6) || !l() || !((jx6) obj).l() || hashCode() == obj.hashCode()) {
            return ngg.r(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return ngg.v(this);
    }

    public zw6 k() {
        Object[] array = toArray(qw6.a);
        ls5 ls5 = zw6.b;
        return zw6.h(array.length, array);
    }

    public boolean l() {
        return this instanceof lfc;
    }
}
