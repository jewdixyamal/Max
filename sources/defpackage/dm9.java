package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: dm9  reason: default package */
public final class dm9 implements FilenameFilter {
    public final /* synthetic */ int a;

    public /* synthetic */ dm9(int i) {
        this.a = i;
    }

    public final boolean accept(File file, String str) {
        switch (this.a) {
            case 0:
                return str.startsWith("liblz4-java-") && !str.endsWith(".lck");
            default:
                return !str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_deps");
        }
    }
}
