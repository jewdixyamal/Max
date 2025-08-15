package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: qd  reason: default package */
public final class qd implements iq6 {
    public static final Pattern d = Pattern.compile("^bytes \\*/([0-9]+)");
    public static final Pattern e = Pattern.compile(".*filename=\".*\\.(\\w+)\".*");
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final je7 b;
    public final w0f c;

    public qd(je7 je7, w0f w0f) {
        this.b = je7;
        this.c = w0f;
    }

    public static boolean d(qd qdVar, yic yic, long j) {
        qdVar.getClass();
        if (yic.o != 416) {
            return false;
        }
        String a2 = yic.Y.a("Content-Range");
        if (a2 == null) {
            a2 = null;
        }
        if (a2 == null) {
            return false;
        }
        Matcher matcher = d.matcher(a2);
        return matcher.find() && ((long) Integer.parseInt(matcher.group(1))) == j;
    }

    public static File e(qd qdVar, File file, File file2, String str) {
        File file3;
        qdVar.getClass();
        try {
            if (!oag.t(str)) {
                String name = file2.getName();
                int E0 = w9e.E0(name, '.', 0, 6);
                if (E0 >= 0) {
                    name = name.substring(0, E0);
                }
                file2 = new File(file2.getParentFile(), name + "." + str);
            }
            file3 = kj6.p(file2.getParentFile(), file2.getName());
            try {
                s5c.s(file, file3);
                file.delete();
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            e = e3;
            file3 = null;
            hm9.p("qd", e.getMessage(), (Throwable) null);
            return file3;
        }
        return file3;
    }

    public static String f(qd qdVar, yic yic) {
        qdVar.getClass();
        String a2 = yic.Y.a("Content-Disposition");
        if (a2 == null) {
            a2 = null;
        }
        if (oag.t(a2)) {
            return null;
        }
        Matcher matcher = e.matcher(a2);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    public static void g(qd qdVar, pd pdVar, String str) {
        qdVar.getClass();
        synchronized (pdVar.a) {
            pdVar.a.clear();
        }
        qdVar.a.remove(str);
    }

    public static void h(qd qdVar, pd pdVar, File file) {
        qdVar.getClass();
        file.delete();
        synchronized (pdVar.a) {
            try {
                Iterator it = pdVar.a.iterator();
                while (it.hasNext()) {
                    ((fq6) it.next()).b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static File i(File file, String str) {
        String parent = file.getParent();
        return new File(parent, file.getName() + "_part_" + str);
    }

    public final void a(File file, String str) {
        pd pdVar = (pd) this.a.get(i(file, str).getAbsolutePath());
        if (pdVar != null) {
            pdVar.b.d();
            synchronized (pdVar.a) {
                try {
                    Iterator it = pdVar.a.iterator();
                    while (it.hasNext()) {
                        ((fq6) it.next()).d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [od, gq1, java.lang.Object] */
    public final boolean b(String str, File file, fq6 fq6, String str2) {
        hm9.m("qd", "downloadFile url = %s", str);
        File i = i(file, str2);
        if (this.a.containsKey(i.getAbsolutePath())) {
            pd pdVar = (pd) this.a.get(i.getAbsolutePath());
            if (pdVar != null) {
                synchronized (pdVar.a) {
                    int i2 = 0;
                    while (i2 < pdVar.a.size()) {
                        try {
                            if (((fq6) pdVar.a.get(i2)).getDownloadContext().equals(fq6.getDownloadContext())) {
                                hm9.m("qd", "file already downloading in listener context, do nothing return false", new Object[0]);
                                return false;
                            }
                            i2++;
                        } finally {
                        }
                    }
                    hm9.m("qd", "file already downloading add listener and return true", new Object[0]);
                    pdVar.a.add(fq6);
                }
            }
            return true;
        }
        try {
            l84 l84 = new l84();
            l84.S(str);
            l84.Q(UUID.randomUUID().toString());
            if (i.exists() && i.length() > 0) {
                hm9.m("qd", "resume download file, downloaded size: " + i.length(), new Object[0]);
                ((bj6) l84.c).a("Range", "bytes=" + i.length() + "-");
            }
            mhc r = l84.r();
            b8c b2 = ((u2a) this.b.getValue()).b(r);
            pd pdVar2 = new pd(b2);
            synchronized (pdVar2.a) {
                pdVar2.a.add(fq6);
                this.a.put(i.getAbsolutePath(), pdVar2);
            }
            ? obj = new Object();
            obj.Y = this;
            obj.b = r;
            obj.c = pdVar2;
            obj.o = i;
            obj.X = file;
            obj.a = false;
            b2.e(obj);
            hm9.m("qd", "start file download", new Object[0]);
            return true;
        } catch (IllegalArgumentException unused) {
            fq6.a();
            i.delete();
            return false;
        }
    }

    public final void c(fq6 fq6) {
        if (fq6 != null) {
            for (pd pdVar : this.a.values()) {
                synchronized (pdVar.a) {
                    pdVar.a.remove(fq6);
                }
            }
        }
    }
}
