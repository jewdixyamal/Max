package defpackage;

import java.util.Collections;
import java.util.Map;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: np  reason: default package */
public final class np extends ty3 implements oca {
    public static final np a = new Object();
    public static je7 b;
    public static final String[] c = {"Prefs", "FilePrefs", hy2.b, "chats-list-job-executor"};
    public static final khe d = new khe(new m(7));
    public static final khe e = new khe(new m(8));

    /* JADX WARNING: type inference failed for: r0v0, types: [np, java.lang.Object] */
    static {
        iy2.m.getClass();
    }

    public final void a(String str, Throwable th) {
        je7 je7;
        z7d z7d;
        khe khe = e;
        if (str == null || str.length() == 0) {
            if (((th instanceof Error) || !((je7 = b) == null || (z7d = (z7d) je7.getValue()) == null || !z7d.n(PmsKey.f125tracernonfatalcrashedenabled, false))) && ((pye) khe.getValue()) != null) {
                pye.b((bjd) null, th, (String) null);
            }
        } else if (((pye) khe.getValue()) != null) {
            pye.b((bjd) null, th, str);
        }
    }

    public final void b(String str, String str2) {
        if (((kye) d.getValue()) != null) {
            kye kye = kye.a;
            Map singletonMap = Collections.singletonMap(str, str2);
            if (!kye.b) {
                try {
                    kbd kbd = kye.e;
                    if (kbd == null) {
                        kbd = null;
                    }
                    kbd.f(singletonMap);
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void c(String str) {
        if (((kye) d.getValue()) != null) {
            try {
                kbd kbd = kye.e;
                if (kbd == null) {
                    kbd = null;
                }
                kbd.getClass();
                kbd.f(Collections.singletonMap("userId", str));
            } catch (Exception unused) {
            }
        }
    }
}
