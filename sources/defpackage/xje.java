package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;

/* renamed from: xje  reason: default package */
public final class xje implements qj3 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ xje() {
        this.a = 0;
    }

    public void a(EventItemsMap eventItemsMap) {
        int i = zxe.$EnumSwitchMapping$0[((xxe) ((k56) this.b).invoke()).ordinal()];
        eventItemsMap.set("call_topology", i != 1 ? i != 2 ? "?" : "D" : "S");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        r1 = r4.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void accept(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 2: goto L_0x0048;
                default: goto L_0x0005;
            }
        L_0x0005:
            e5f r4 = (defpackage.e5f) r4
            java.lang.Object r3 = r3.b
            od r3 = (defpackage.od) r3
            boolean r4 = r3.a
            if (r4 == 0) goto L_0x0047
            java.lang.Object r4 = r3.b
            a4c r4 = (defpackage.a4c) r4
            java.lang.String r0 = "OwnTalkingReporter"
            java.lang.String r1 = "on voice stop detected and reported"
            r4.log(r0, r1)
            java.lang.Object r4 = r3.Y
            ync r4 = (defpackage.ync) r4
            r0 = 0
            if (r4 == 0) goto L_0x0045
            java.lang.Object r4 = r4.b
            kg1 r4 = (defpackage.kg1) r4
            fg1 r1 = r4.a
            boolean r2 = r1.d()
            r1.n = r0
            boolean r1 = r1.d()
            if (r2 == r1) goto L_0x0045
            fg1 r1 = r4.a
            bg1 r2 = r1.a
            if (r2 != 0) goto L_0x003a
            goto L_0x0045
        L_0x003a:
            zad r2 = r4.c(r2)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r4.e(r2, r1)
        L_0x0045:
            r3.a = r0
        L_0x0047:
            return
        L_0x0048:
            ly8 r4 = (defpackage.ly8) r4
            java.lang.Object r3 = r3.b
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r3 = (ru.ok.tamtam.upload.workers.UploadFileAttachWorker) r3
            r3.g(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xje.accept(java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.qnf b(defpackage.h23 r5) {
        /*
            r4 = this;
            java.lang.Class r0 = r5.a
            boolean r1 = r0.isAnonymousClass()
            r2 = 0
            if (r1 == 0) goto L_0x000a
            goto L_0x004b
        L_0x000a:
            boolean r1 = r0.isLocalClass()
            if (r1 == 0) goto L_0x0011
            goto L_0x004b
        L_0x0011:
            boolean r1 = r0.isArray()
            java.util.HashMap r3 = defpackage.h23.c
            if (r1 == 0) goto L_0x003a
            java.lang.Class r0 = r0.getComponentType()
            boolean r1 = r0.isPrimitive()
            if (r1 == 0) goto L_0x0035
            java.lang.String r0 = r0.getName()
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0035
            java.lang.String r1 = "Array"
            java.lang.String r2 = r0.concat(r1)
        L_0x0035:
            if (r2 != 0) goto L_0x004b
            java.lang.String r2 = "kotlin.Array"
            goto L_0x004b
        L_0x003a:
            java.lang.String r1 = r0.getName()
            java.lang.Object r1 = r3.get(r1)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x004b
            java.lang.String r2 = r0.getCanonicalName()
        L_0x004b:
            if (r2 == 0) goto L_0x005c
            java.lang.String r0 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r0 = r0.concat(r2)
            java.lang.Object r4 = r4.b
            k8g r4 = (defpackage.k8g) r4
            qnf r4 = r4.s(r5, r0)
            return r4
        L_0x005c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Local and anonymous classes can not be ViewModels"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xje.b(h23):qnf");
    }

    public void c(b9b b9b) {
        moa moa = (moa) this.b;
        moa.a = b9b;
        Iterator it = ((LinkedList) moa.c).iterator();
        while (it.hasNext()) {
            ((neg) it.next()).b();
        }
        ((LinkedList) moa.c).clear();
        moa.b = null;
    }

    public /* synthetic */ xje(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public xje(xnf xnf, vnf vnf) {
        this(xnf, vnf, jz3.b);
        this.a = 3;
    }

    public xje(xnf xnf, vnf vnf, lz3 lz3) {
        this.a = 3;
        this.b = new k8g((Object) xnf, (Object) vnf, (Object) lz3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xje(defpackage.ynf r4) {
        /*
            r3 = this;
            r0 = 3
            r3.a = r0
            xnf r0 = r4.w()
            boolean r1 = r4 instanceof defpackage.pi6
            if (r1 == 0) goto L_0x0013
            r2 = r4
            pi6 r2 = (defpackage.pi6) r2
            vnf r2 = r2.o()
            goto L_0x0015
        L_0x0013:
            sf4 r2 = defpackage.sf4.a
        L_0x0015:
            if (r1 == 0) goto L_0x001e
            pi6 r4 = (defpackage.pi6) r4
            wh9 r4 = r4.p()
            goto L_0x0020
        L_0x001e:
            jz3 r4 = defpackage.jz3.b
        L_0x0020:
            r3.<init>(r0, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xje.<init>(ynf):void");
    }
}
