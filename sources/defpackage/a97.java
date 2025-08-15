package defpackage;

import kotlinx.coroutines.internal.Symbol;

/* renamed from: a97  reason: default package */
public abstract class a97 {
    public static final Symbol a = new Symbol("COMPLETING_ALREADY");
    public static final Symbol b = new Symbol("COMPLETING_WAITING_CHILDREN");
    public static final Symbol c = new Symbol("COMPLETING_RETRY");
    public static final Symbol d = new Symbol("TOO_LATE_TO_CANCEL");
    public static final Symbol e = new Symbol("SEALED");
    public static final ez4 f = new ez4(false);
    public static final ez4 g = new ez4(true);

    public static final Object a(Object obj) {
        nz6 nz6;
        oz6 oz6 = obj instanceof oz6 ? (oz6) obj : null;
        return (oz6 == null || (nz6 = oz6.a) == null) ? obj : nz6;
    }
}
