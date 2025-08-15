package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import org.json.HTTP;

/* renamed from: w9e  reason: default package */
public abstract class w9e extends eae {
    public static /* synthetic */ int A0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return x0(i, charSequence, str, z);
    }

    public static final int B0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            if (i < 0) {
                i = 0;
            }
            int v0 = v0(charSequence);
            if (i > v0) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(i);
                for (char o : cArr) {
                    if (nd7.o(o, charAt, z)) {
                        return i;
                    }
                }
                if (i == v0) {
                    return -1;
                }
                i++;
            }
        } else {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            } else if (length == 1) {
                return ((String) charSequence).indexOf(cArr[0], i);
            } else {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        }
    }

    public static boolean C0(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (!nd7.E(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char D0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(v0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int E0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = v0(charSequence);
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(cArr[0], i);
        }
        int v0 = v0(charSequence);
        if (i > v0) {
            i = v0;
        }
        while (-1 < i) {
            if (nd7.o(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int F0(String str, CharSequence charSequence, int i) {
        int v0 = (i & 2) != 0 ? v0(charSequence) : 0;
        return !(charSequence instanceof String) ? y0(charSequence, str, v0, 0, false, true) : ((String) charSequence).lastIndexOf(str, v0);
    }

    public static r1f G0(CharSequence charSequence) {
        return R0(charSequence, new String[]{HTTP.CRLF, "\n", "\r"}, false, 6);
    }

    public static String H0(String str, int i, char c) {
        CharSequence charSequence;
        if (i >= 0) {
            if (i <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb = new StringBuilder(i);
                int length = i - str.length();
                int i2 = 1;
                if (1 <= length) {
                    while (true) {
                        sb.append(c);
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
                sb.append(str);
                charSequence = sb;
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(wg0.g(i, "Desired length ", " is less than zero."));
    }

    public static kh4 I0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        N0(i);
        return new kh4(charSequence, 0, i, new fae(Arrays.asList(strArr), z, 1));
    }

    public static final boolean J0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!nd7.o(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String K0(String str, String str2) {
        return T0(str2, str) ? str.substring(str2.length()) : str;
    }

    public static String L0(String str, String str2) {
        return t0(str2, str) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static StringBuilder M0(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
        throw new IndexOutOfBoundsException(wg0.h("End index (", i2, ") is less than start index (", i, ")."));
    }

    public static final void N0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(zr6.h(i, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List O0(int i, CharSequence charSequence, String str, boolean z) {
        N0(i);
        int i2 = 0;
        int x0 = x0(0, charSequence, str, z);
        if (x0 == -1 || i == 1) {
            return Collections.singletonList(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i3 = 10;
        if (z2 && i <= 10) {
            i3 = i;
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, x0).toString());
            i2 = str.length() + x0;
            if ((z2 && arrayList.size() == i - 1) || (x0 = x0(i2, charSequence, str, z)) == -1) {
                arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i2, x0).toString());
            i2 = str.length() + x0;
            break;
        } while ((x0 = x0(i2, charSequence, str, z)) == -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    public static List P0(CharSequence charSequence, char[] cArr) {
        if (cArr.length == 1) {
            return O0(0, charSequence, String.valueOf(cArr[0]), false);
        }
        N0(0);
        kh4<j37> kh4 = new kh4(charSequence, 0, 0, new fae(cArr, false, 0));
        ArrayList arrayList = new ArrayList(z53.S(new zs(3, kh4), 10));
        for (j37 j37 : kh4) {
            arrayList.add(charSequence.subSequence(j37.a, j37.b + 1).toString());
        }
        return arrayList;
    }

    public static List Q0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return O0(0, charSequence, str, z);
            }
        }
        kh4<j37> I0 = I0(charSequence, strArr, z, 0);
        ArrayList arrayList = new ArrayList(z53.S(new zs(3, I0), 10));
        for (j37 j37 : I0) {
            arrayList.add(charSequence.subSequence(j37.a, j37.b + 1).toString());
        }
        return arrayList;
    }

    public static r1f R0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return new r1f(I0(charSequence, strArr, z, 0), new c0(9, charSequence));
    }

    public static boolean S0(CharSequence charSequence, char c) {
        return charSequence.length() > 0 && nd7.o(charSequence.charAt(0), c, false);
    }

    public static boolean T0(String str, CharSequence charSequence) {
        if ((charSequence instanceof String) && (str instanceof String)) {
            return eae.o0((String) charSequence, str, false);
        }
        return J0(charSequence, 0, str, 0, str.length(), false);
    }

    public static String U0(String str, String str2) {
        int A0 = A0(str, str2, 0, false, 6);
        return A0 == -1 ? str : str.substring(str2.length() + A0, str.length());
    }

    public static String V0(String str) {
        int E0 = E0(str, '.', 0, 6);
        return E0 == -1 ? str : str.substring(E0 + 1, str.length());
    }

    public static String W0(String str, String str2) {
        int A0 = A0(str, str2, 0, false, 6);
        return A0 == -1 ? str : str.substring(0, A0);
    }

    public static CharSequence X0(int i, CharSequence charSequence) {
        if (i >= 0) {
            int length = charSequence.length();
            if (i > length) {
                i = length;
            }
            return charSequence.subSequence(0, i);
        }
        throw new IllegalArgumentException(wg0.g(i, "Requested character count ", " is less than zero.").toString());
    }

    public static String Y0(int i, String str) {
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            return str.substring(0, i);
        }
        throw new IllegalArgumentException(wg0.g(i, "Requested character count ", " is less than zero.").toString());
    }

    public static String Z0(int i, String str) {
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            return str.substring(length - i);
        }
        throw new IllegalArgumentException(wg0.g(i, "Requested character count ", " is less than zero.").toString());
    }

    public static Boolean a1(String str) {
        if (str.equals("true")) {
            return Boolean.TRUE;
        }
        if (str.equals("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static CharSequence b1(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean E = nd7.E(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!E) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!E) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static boolean p0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (!(charSequence2 instanceof String)) {
            if (y0(charSequence, charSequence2, 0, charSequence.length(), z, false) < 0) {
                return false;
            }
        } else if (A0(charSequence, (String) charSequence2, 0, z, 2) < 0) {
            return false;
        }
        return true;
    }

    public static boolean q0(CharSequence charSequence, char c) {
        return z0(charSequence, c, 0, false, 2) >= 0;
    }

    public static String r0(int i, String str) {
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            return str.substring(i);
        }
        throw new IllegalArgumentException(wg0.g(i, "Requested character count ", " is less than zero.").toString());
    }

    public static boolean s0(CharSequence charSequence, char c) {
        return charSequence.length() > 0 && nd7.o(charSequence.charAt(v0(charSequence)), c, false);
    }

    public static boolean t0(String str, CharSequence charSequence) {
        if (charSequence instanceof String) {
            return ((String) charSequence).endsWith(str);
        }
        return J0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static Character u0(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static int v0(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    public static Character w0(int i, CharSequence charSequence) {
        if (i < 0 || i >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i));
    }

    public static final int x0(int i, CharSequence charSequence, String str, boolean z) {
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return y0(charSequence, str, i, charSequence.length(), z, false);
    }

    public static final int y0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        h37 h37;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            h37 = new h37(i, i2, 1);
        } else {
            int v0 = v0(charSequence);
            if (i > v0) {
                i = v0;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            h37 = new h37(i, i2, -1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = h37.c;
        int i4 = h37.b;
        int i5 = h37.a;
        if (!z3 || !(charSequence2 instanceof String)) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    if (!J0(charSequence2, 0, charSequence, i5, charSequence2.length(), z)) {
                        if (i5 == i4) {
                            break;
                        }
                        i5 += i3;
                    } else {
                        return i5;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            while (true) {
                if (!eae.l0(0, i5, ((String) charSequence2).length(), (String) charSequence2, (String) charSequence, z)) {
                    if (i5 == i4) {
                        break;
                    }
                    i5 += i3;
                } else {
                    return i5;
                }
            }
        }
        return -1;
    }

    public static int z0(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return B0(charSequence, new char[]{c}, i, z);
    }
}
