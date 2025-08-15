package ru.ok.tracer.disk.usage;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tracer/disk/usage/DiskUsageWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "gl4", "tracer-disk-usage_release"}, k = 1, mv = {1, 7, 1})
public final class DiskUsageWorker extends Worker {
    public final khe b = new khe(h8.c);

    public DiskUsageWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String c(long j, LinkedHashMap linkedHashMap) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            jSONObject2.put(((vd6) entry.getKey()).a, (Object) d((gl4) entry.getValue()));
        }
        jSONObject.put("consumers", (Object) jSONObject2);
        jSONObject.put("total_size", j);
        return jSONObject.toString();
    }

    public static JSONObject d(gl4 gl4) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("size", gl4.a);
        jSONObject.put("name", (Object) gl4.b);
        if (gl4.c) {
            jSONObject.put("is_dir", true);
        }
        if (gl4.e) {
            jSONObject.put("is_overflow", true);
        }
        if (gl4.f) {
            jSONObject.put("is_excluded", true);
        }
        List<gl4> list = gl4.d;
        if (!list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = new ArrayList(z53.S(list, 10));
            for (gl4 d : list) {
                arrayList.add(jSONArray.put((Object) d(d)));
            }
            jSONObject.put("children", (Object) jSONArray);
        }
        return jSONObject;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: nz4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: nz4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.gl4 g(java.io.File r21, int r22, java.util.ArrayList r23) {
        /*
            r0 = r22
            r1 = r21
            r2 = r23
            boolean r3 = r2.contains(r1)
            if (r3 == 0) goto L_0x0022
            java.util.Objects.toString(r21)
            gl4 r0 = new gl4
            java.lang.String r7 = r21.getName()
            r10 = 0
            r11 = 1
            r5 = 0
            r8 = 0
            r9 = 0
            r12 = 28
            r4 = r0
            r4.<init>(r5, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x0022:
            boolean r3 = r21.isDirectory()
            if (r3 != 0) goto L_0x003d
            gl4 r0 = new gl4
            long r5 = r21.length()
            java.lang.String r7 = r21.getName()
            r10 = 0
            r11 = 0
            r8 = 0
            r9 = 0
            r12 = 60
            r4 = r0
            r4.<init>(r5, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x003d:
            r3 = 1
            r4 = 0
            java.io.File r5 = r21.getParentFile()     // Catch:{ IOException -> 0x0062 }
            if (r5 != 0) goto L_0x0047
            r6 = r1
            goto L_0x0054
        L_0x0047:
            java.io.File r5 = r5.getCanonicalFile()     // Catch:{ IOException -> 0x0062 }
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x0062 }
            java.lang.String r7 = r21.getName()     // Catch:{ IOException -> 0x0062 }
            r6.<init>(r5, r7)     // Catch:{ IOException -> 0x0062 }
        L_0x0054:
            java.io.File r5 = r6.getCanonicalFile()     // Catch:{ IOException -> 0x0062 }
            java.io.File r6 = r6.getAbsoluteFile()     // Catch:{ IOException -> 0x0062 }
            boolean r5 = defpackage.tpa.f(r5, r6)     // Catch:{ IOException -> 0x0062 }
            r5 = r5 ^ r3
            goto L_0x0063
        L_0x0062:
            r5 = r4
        L_0x0063:
            if (r5 == 0) goto L_0x0078
            gl4 r0 = new gl4
            java.lang.String r9 = r21.getName()
            r12 = 0
            r13 = 0
            r7 = 0
            r10 = 1
            r11 = 0
            r14 = 56
            r6 = r0
            r6.<init>(r7, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x0078:
            java.io.File[] r5 = r21.listFiles()
            nz4 r6 = defpackage.nz4.a
            if (r5 == 0) goto L_0x0098
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = r5.length
            r7.<init>(r8)
            int r8 = r5.length
            r9 = r4
        L_0x0088:
            if (r9 >= r8) goto L_0x0099
            r10 = r5[r9]
            int r11 = r0 + 1
            gl4 r10 = g(r10, r11, r2)
            r7.add(r10)
            int r9 = r9 + 1
            goto L_0x0088
        L_0x0098:
            r7 = r6
        L_0x0099:
            r2 = 4096(0x1000, float:5.74E-42)
            long r8 = (long) r2
            java.util.Iterator r2 = r7.iterator()
            r10 = 0
        L_0x00a2:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00b2
            java.lang.Object r5 = r2.next()
            gl4 r5 = (defpackage.gl4) r5
            long r12 = r5.a
            long r10 = r10 + r12
            goto L_0x00a2
        L_0x00b2:
            long r13 = r8 + r10
            r2 = 6
            if (r0 <= r2) goto L_0x00bc
            r21.toString()
            r0 = r3
            goto L_0x00be
        L_0x00bc:
            r0 = r4
            r6 = r7
        L_0x00be:
            fs4 r2 = new fs4
            r5 = 25
            r2.<init>(r5)
            java.util.List r2 = defpackage.x53.x0(r6, r2)
            int r5 = r2.size()
            r6 = 20
            if (r5 <= r6) goto L_0x00dd
            r21.toString()
            java.util.List r0 = r2.subList(r4, r6)
            r17 = r0
            r18 = r3
            goto L_0x00e1
        L_0x00dd:
            r18 = r0
            r17 = r2
        L_0x00e1:
            gl4 r0 = new gl4
            java.lang.String r15 = r21.getName()
            r16 = 1
            r19 = 0
            r20 = 32
            r12 = r0
            r12.<init>(r13, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tracer.disk.usage.DiskUsageWorker.g(java.io.File, int, java.util.ArrayList):gl4");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        r0 = r0.getParentFile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (defpackage.n4c.b.i(r5) == 0) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.fm7 b() {
        /*
            r8 = this;
            o97 r1 = defpackage.oag.a
            boolean r0 = defpackage.dp3.b(r1)
            if (r0 == 0) goto L_0x000d
            em7 r8 = defpackage.fm7.b()
            return r8
        L_0x000d:
            d24 r0 = r8.getInputData()
            java.lang.String r2 = "probability"
            r3 = 0
            long r5 = r0.d(r2, r3)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x001f
            goto L_0x00d0
        L_0x001f:
            if (r0 != 0) goto L_0x0022
            goto L_0x0031
        L_0x0022:
            m4c r0 = defpackage.n4c.a
            r0.getClass()
            d3 r0 = defpackage.n4c.b
            long r5 = r0.i(r5)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00d0
        L_0x0031:
            android.content.Context r0 = r8.getApplicationContext()
            android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.lang.String r6 = r2.dataDir     // Catch:{ Exception -> 0x00cb }
            vd6 r7 = defpackage.vd6.INTERNAL_DATA     // Catch:{ Exception -> 0x00cb }
            r8.e(r6, r7, r5)     // Catch:{ Exception -> 0x00cb }
            r6 = 0
            java.io.File r0 = r0.getExternalFilesDir(r6)     // Catch:{ Exception -> 0x00cb }
            if (r0 == 0) goto L_0x0057
            java.io.File r0 = r0.getParentFile()     // Catch:{ Exception -> 0x00cb }
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x00cb }
            goto L_0x0058
        L_0x0057:
            r0 = r6
        L_0x0058:
            vd6 r7 = defpackage.vd6.EXTERNAL_DATA     // Catch:{ Exception -> 0x00cb }
            r8.e(r0, r7, r5)     // Catch:{ Exception -> 0x00cb }
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00cb }
            java.lang.String r2 = r2.sourceDir     // Catch:{ Exception -> 0x00cb }
            r0.<init>(r2)     // Catch:{ Exception -> 0x00cb }
            java.io.File r0 = r0.getParentFile()     // Catch:{ Exception -> 0x00cb }
            if (r0 == 0) goto L_0x006e
            java.lang.String r6 = r0.getPath()     // Catch:{ Exception -> 0x00cb }
        L_0x006e:
            vd6 r0 = defpackage.vd6.SRC     // Catch:{ Exception -> 0x00cb }
            r8.e(r6, r0, r5)     // Catch:{ Exception -> 0x00cb }
            java.util.Collection r0 = r5.values()     // Catch:{ Exception -> 0x00cb }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x00cb }
        L_0x007b:
            boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x00cb }
            if (r2 == 0) goto L_0x008b
            java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x00cb }
            gl4 r2 = (defpackage.gl4) r2     // Catch:{ Exception -> 0x00cb }
            long r6 = r2.a     // Catch:{ Exception -> 0x00cb }
            long r3 = r3 + r6
            goto L_0x007b
        L_0x008b:
            khe r0 = r8.b     // Catch:{ Exception -> 0x00cb }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x00cb }
            fl4 r0 = (defpackage.fl4) r0     // Catch:{ Exception -> 0x00cb }
            r0.getClass()     // Catch:{ Exception -> 0x00cb }
            r6 = 10737418240(0x280000000, double:5.3049894774E-314)
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c6
            android.content.Context r0 = r8.getApplicationContext()     // Catch:{ Exception -> 0x00cb }
            java.io.File r2 = defpackage.mq9.h(r0, r1)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r0 = c(r3, r5)     // Catch:{ Exception -> 0x00cb }
            defpackage.lk5.K(r2, r0)     // Catch:{ Exception -> 0x00cb }
            android.content.Context r0 = r8.getApplicationContext()     // Catch:{ Exception -> 0x00cb }
            java.lang.Long r4 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r8 = "limit"
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x00cb }
            java.util.Map r5 = java.util.Collections.singletonMap(r8, r3)     // Catch:{ Exception -> 0x00cb }
            r6 = 88
            r3 = 0
            defpackage.nd2.i(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00cb }
        L_0x00c6:
            em7 r8 = defpackage.fm7.b()
            return r8
        L_0x00cb:
            cm7 r8 = defpackage.fm7.a()
            return r8
        L_0x00d0:
            em7 r8 = defpackage.fm7.b()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tracer.disk.usage.DiskUsageWorker.b():fm7");
    }

    public final void e(String str, vd6 vd6, LinkedHashMap linkedHashMap) {
        if (str != null) {
            File file = new File(str);
            ((fl4) this.b.getValue()).getClass();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(lk5.J(file, ((String) it.next()).substring(vd6.a.length() + 1)));
            }
            linkedHashMap.put(vd6, g(file, 0, arrayList2));
        }
    }
}
