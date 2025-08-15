package defpackage;

/* renamed from: nec  reason: default package */
public abstract class nec {
    public static final oec a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: oec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: oec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: oec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: oec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: oec} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 0
            java.lang.String r1 = "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x000e }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x000e }
            oec r1 = (defpackage.oec) r1     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x000e }
            r0 = r1
        L_0x000e:
            if (r0 == 0) goto L_0x0011
            goto L_0x0016
        L_0x0011:
            oec r0 = new oec
            r0.<init>()
        L_0x0016:
            a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nec.<clinit>():void");
    }

    public static h23 a(Class cls) {
        a.getClass();
        return new h23(cls);
    }
}
