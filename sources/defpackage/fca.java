package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;

/* renamed from: fca  reason: default package */
public abstract class fca {
    public static final Pattern a = Pattern.compile("[^\\p{L}\\p{Nd} ]+");

    public static CharSequence a(CharSequence charSequence, ida ida) {
        if (charSequence.length() == 0) {
            return "";
        }
        tx4 tx4 = ida.j;
        if (tx4.a(0, charSequence)) {
            List c = tx4.c(charSequence);
            if (!c.isEmpty()) {
                return (CharSequence) x53.g0(c);
            }
        }
        String replaceAll = a.matcher(charSequence).replaceAll("");
        if (replaceAll.length() != 0 && !w9e.C0(replaceAll)) {
            List Q0 = w9e.Q0(replaceAll, new String[]{" "}, false, 6);
            ArrayList arrayList = new ArrayList();
            for (Object next : Q0) {
                if (!w9e.C0((String) next)) {
                    arrayList.add(next);
                }
            }
            StringBuilder sb = new StringBuilder();
            int min = Math.min(arrayList.size(), 2);
            for (int i = 0; i < min; i++) {
                String str = (String) arrayList.get(i);
                if (str.length() != 0 && !w9e.C0(str)) {
                    sb.append(Character.toUpperCase(str.charAt(0)));
                }
            }
            return sb.toString();
        } else if (charSequence.length() <= 0) {
            return "";
        } else {
            if (charSequence.length() != 0) {
                return String.valueOf(charSequence.charAt(0));
            }
            throw new NoSuchElementException("Char sequence is empty.");
        }
    }

    public static String b(CharSequence charSequence, CharSequence charSequence2) {
        int i = charSequence2 == null ? 1 : 2;
        Pattern pattern = a;
        String replaceAll = pattern.matcher(charSequence).replaceAll("");
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        String replaceAll2 = pattern.matcher(charSequence2).replaceAll("");
        StringBuilder sb = new StringBuilder();
        List M = y53.M(w9e.u0(replaceAll), w9e.u0(replaceAll2));
        for (int i2 = 0; i2 < i; i2++) {
            Character ch = (Character) x53.j0(i2, M);
            if (ch != null) {
                sb.append(ch.charValue());
            }
        }
        return sb.toString();
    }
}
