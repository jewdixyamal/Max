package defpackage;

import java.io.File;
import java.io.FileFilter;

/* renamed from: rc4  reason: default package */
public final /* synthetic */ class rc4 implements FileFilter {
    public final /* synthetic */ String a;

    public /* synthetic */ rc4(String str) {
        this.a = str;
    }

    public final boolean accept(File file) {
        String name = file.getName();
        if (name == null || name.length() == 0) {
            return false;
        }
        return eae.o0(name, this.a, false);
    }
}
