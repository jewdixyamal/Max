package defpackage;

import android.text.Spannable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: cre  reason: default package */
public abstract class cre {
    public static final Pattern a = Pattern.compile("#(?i)([\\p{L}0-9_]+)");

    public static void a(Spannable spannable, lk7 lk7, boolean z, int i) {
        ui0 ui0 = new ui0((Object) spannable, (Object) lk7, i, 13);
        if (lk7 == lk7.o) {
            c(spannable.toString(), b(lk7, z), ura.b, false, ui0);
            return;
        }
        String obj = spannable.toString();
        Pattern b = b(lk7, z);
        Pattern pattern = ura.a;
        c(obj, b, (Pattern) null, false, ui0);
    }

    public static Pattern b(lk7 lk7, boolean z) {
        int ordinal = lk7.ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? bre.a : bre.a : z ? bre.e : bre.c : a;
    }

    public static void c(CharSequence charSequence, Pattern pattern, Pattern pattern2, boolean z, qj3 qj3) {
        Pattern pattern3 = ura.a;
        Matcher matcher = pattern.matcher(charSequence);
        while (matcher.find()) {
            Matcher matcher2 = pattern3.matcher(charSequence);
            while (true) {
                if (matcher2.find()) {
                    if ((matcher.start() >= matcher2.start() && matcher.end() <= matcher2.end()) || ((matcher.end() <= matcher2.end() && matcher.end() >= matcher2.start()) || (matcher.start() <= matcher2.end() && matcher.end() >= matcher2.end()))) {
                        break;
                    }
                } else {
                    if (!z && pattern == bre.a) {
                        Matcher matcher3 = bre.e.matcher(charSequence);
                        while (true) {
                            if (matcher3.find() && matcher.start() >= matcher3.start() && matcher.end() <= matcher3.end()) {
                                if (matcher3.group().contains(matcher.group())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (pattern2 != null) {
                        Matcher matcher4 = pattern2.matcher(charSequence);
                        while (true) {
                            if (matcher4.find() && matcher.start() >= matcher4.start() && matcher.end() <= matcher4.end()) {
                                if (matcher4.group().contains(matcher.group())) {
                                    break;
                                }
                            }
                        }
                    }
                    try {
                        qj3.accept(new yqe(matcher.start(), matcher.end(), matcher.group()));
                        break;
                    } catch (Throwable th) {
                        hm9.p("cre", th.getMessage(), th);
                    }
                }
            }
        }
    }
}
