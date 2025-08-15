package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import ru.ok.tamtam.util.HandledException;

/* renamed from: x00  reason: default package */
public final /* synthetic */ class x00 implements qj3, d38, b66 {
    public final /* synthetic */ y00 a;

    public /* synthetic */ x00(y00 y00) {
        this.a = y00;
    }

    public void accept(Object obj) {
        y00 y00 = this.a;
        Throwable th = (Throwable) obj;
        y00.getClass();
        hm9.p("AttachPreviewDiskCache", "onError", th);
        ((cba) y00.b).c(new HandledException(th), true);
    }

    public Object apply(Object obj) {
        this.a.getClass();
        HashMap hashMap = new HashMap();
        for (File file : (List) obj) {
            String name = file.getName();
            String str = !name.endsWith(".png") ? null : name.split("_")[1];
            if (!oag.t(str)) {
                hashMap.put(str, Uri.fromFile(file));
            }
        }
        return hashMap;
    }

    public void d(j28 j28) {
        kk5 kk5 = (kk5) this.a.c;
        kk5.getClass();
        File g = kk5.g(kk5.b(), "previewVideoCache");
        if (!pag.k(g) && !j28.h()) {
            j28.b();
        }
        File[] listFiles = g.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            Arrays.sort(listFiles, new v00(0));
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < listFiles.length && i < 200) {
                arrayList.add(listFiles[i]);
                i++;
            }
            if (!j28.h()) {
                j28.a(arrayList);
            }
        } else if (!j28.h()) {
            j28.b();
        }
    }
}
