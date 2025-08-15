package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: js4  reason: default package */
public final class js4 {
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public volatile ngg e;
    public final Object f;

    public js4(File file) {
        this.a = file;
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            this.b = parentFile;
            this.c = lk5.J(parentFile, file.getName() + ".tmp");
            this.d = lk5.J(parentFile, file.getName() + ".taken");
            this.e = hs4.d;
            this.f = new Object();
            return;
        }
        throw new IllegalStateException(("File " + file + " not in directory").toString());
    }

    public final void a(List list) {
        List list2;
        if (!list.isEmpty()) {
            synchronized (this.f) {
                ngg ngg = this.e;
                if (!(ngg instanceof is4) || list != ((List) ((is4) ngg).d.get())) {
                    ngg ngg2 = this.e;
                    if (ngg2 instanceof hs4) {
                        list2 = b();
                    } else if (ngg2 instanceof gs4) {
                        list2 = ((gs4) ngg2).d;
                    } else if (ngg2 instanceof is4) {
                        list2 = nz4.a;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    List g = nd2.g(list2, list);
                    c(g);
                    this.e = new gs4(g);
                    return;
                }
                this.b.mkdirs();
                this.d.renameTo(this.a);
                this.e = new gs4(list);
            }
        }
    }

    public final List b() {
        File file = this.a;
        boolean exists = file.exists();
        nz4 nz4 = nz4.a;
        if (!exists) {
            return nz4;
        }
        try {
            JSONArray jSONArray = new JSONArray(lk5.I(file));
            kl7 l = j1e.l();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                l.add(new ls4(jSONObject.getString("event"), jSONObject.getString("reason"), jSONObject.getInt(NewHtcHomeBadger.COUNT)));
            }
            return j1e.d(l);
        } catch (JSONException unused) {
            Objects.toString(file);
            try {
                m6d.k(file);
            } catch (IOException unused2) {
                Objects.toString(file);
            }
            return nz4;
        } catch (IOException unused3) {
            Objects.toString(file);
            return nz4;
        }
    }

    public final void c(List list) {
        File file = this.c;
        File file2 = this.a;
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ls4 ls4 = (ls4) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", (Object) ls4.a);
            jSONObject.put("reason", (Object) ls4.b);
            jSONObject.put(NewHtcHomeBadger.COUNT, ls4.c);
            jSONArray.put((Object) jSONObject);
        }
        String jSONArray2 = jSONArray.toString();
        try {
            m6d.y(this.b);
            lk5.K(file, jSONArray2);
            m6d.K(file, file2);
        } catch (IOException unused) {
            Objects.toString(file2);
            try {
                m6d.k(file2);
            } catch (IOException unused2) {
                Objects.toString(file2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List d() {
        /*
            r4 = this;
            ngg r0 = r4.e
            boolean r1 = r0 instanceof defpackage.gs4
            if (r1 == 0) goto L_0x0014
            r1 = r0
            gs4 r1 = (defpackage.gs4) r1
            java.util.List r1 = r1.d
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0014
            nz4 r4 = defpackage.nz4.a
            return r4
        L_0x0014:
            boolean r0 = r0 instanceof defpackage.is4
            if (r0 == 0) goto L_0x001b
            nz4 r4 = defpackage.nz4.a
            return r4
        L_0x001b:
            java.lang.Object r0 = r4.f
            monitor-enter(r0)
            ngg r1 = r4.e     // Catch:{ all -> 0x0029 }
            boolean r2 = r1 instanceof defpackage.hs4     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x002b
            java.util.List r1 = r4.b()     // Catch:{ all -> 0x0029 }
            goto L_0x0033
        L_0x0029:
            r4 = move-exception
            goto L_0x0063
        L_0x002b:
            boolean r2 = r1 instanceof defpackage.gs4     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0055
            gs4 r1 = (defpackage.gs4) r1     // Catch:{ all -> 0x0029 }
            java.util.List r1 = r1.d     // Catch:{ all -> 0x0029 }
        L_0x0033:
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x0029 }
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x004a
            java.io.File r2 = r4.a     // Catch:{ all -> 0x0029 }
            java.io.File r3 = r4.d     // Catch:{ all -> 0x0029 }
            r2.renameTo(r3)     // Catch:{ all -> 0x0029 }
            is4 r2 = new is4     // Catch:{ all -> 0x0029 }
            r2.<init>(r1)     // Catch:{ all -> 0x0029 }
            r4.e = r2     // Catch:{ all -> 0x0029 }
            goto L_0x0053
        L_0x004a:
            gs4 r2 = new gs4     // Catch:{ all -> 0x0029 }
            nz4 r3 = defpackage.nz4.a     // Catch:{ all -> 0x0029 }
            r2.<init>(r3)     // Catch:{ all -> 0x0029 }
            r4.e = r2     // Catch:{ all -> 0x0029 }
        L_0x0053:
            monitor-exit(r0)
            return r1
        L_0x0055:
            boolean r4 = r1 instanceof defpackage.is4     // Catch:{ all -> 0x0029 }
            if (r4 == 0) goto L_0x005d
            nz4 r4 = defpackage.nz4.a     // Catch:{ all -> 0x0029 }
            monitor-exit(r0)
            return r4
        L_0x005d:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0029 }
            r4.<init>()     // Catch:{ all -> 0x0029 }
            throw r4     // Catch:{ all -> 0x0029 }
        L_0x0063:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.js4.d():java.util.List");
    }
}
