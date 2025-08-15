package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: av0  reason: default package */
public abstract class av0 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final String c;
    public final lq9 d;
    public final hx9 e;
    public final yu0 f = new yu0(0);
    public final yu0 g = new yu0(1);
    public final ConcurrentHashMap h = new ConcurrentHashMap();

    public av0() {
        lq9 lq9 = lq9.Y;
        hx9 hx9 = hx9.s0;
        this.d = lq9;
        this.c = "default";
        this.e = hx9;
    }

    public static void a(Object obj, t35 t35) {
        try {
            t35.a(obj);
        } catch (InvocationTargetException e2) {
            e("Could not dispatch event: " + obj.getClass() + " to handler " + t35, e2);
            throw null;
        }
    }

    public static void b(t35 t35, e45 e45) {
        try {
            Object a2 = e45.a();
            if (a2 != null) {
                a(a2, t35);
            }
        } catch (InvocationTargetException e2) {
            e("Producer " + e45 + " threw an exception.", e2);
            throw null;
        }
    }

    public static void e(String str, InvocationTargetException invocationTargetException) {
        Throwable cause = invocationTargetException.getCause();
        if (cause != null) {
            StringBuilder o = rh4.o(str, ": ");
            o.append(cause.getMessage());
            throw new RuntimeException(o.toString(), cause);
        }
        StringBuilder o2 = rh4.o(str, ": ");
        o2.append(invocationTargetException.getMessage());
        throw new RuntimeException(o2.toString(), invocationTargetException);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.util.Set} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(java.lang.Object r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x00d6
            r0 = r7
            cy7 r0 = (defpackage.cy7) r0
            lq9 r1 = r7.d
            r1.b(r0)
            java.lang.Class r1 = r8.getClass()
            java.util.concurrent.ConcurrentHashMap r2 = r7.h
            java.lang.Object r3 = r2.get(r1)
            java.util.Set r3 = (java.util.Set) r3
            r4 = 0
            if (r3 != 0) goto L_0x0049
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r3.add(r1)
        L_0x0026:
            boolean r6 = r3.isEmpty()
            if (r6 != 0) goto L_0x003f
            java.lang.Object r6 = r3.remove(r4)
            java.lang.Class r6 = (java.lang.Class) r6
            r5.add(r6)
            java.lang.Class r6 = r6.getSuperclass()
            if (r6 == 0) goto L_0x0026
            r3.add(r6)
            goto L_0x0026
        L_0x003f:
            java.lang.Object r1 = r2.putIfAbsent(r1, r5)
            r3 = r1
            java.util.Set r3 = (java.util.Set) r3
            if (r3 != 0) goto L_0x0049
            r3 = r5
        L_0x0049:
            java.util.Iterator r1 = r3.iterator()
        L_0x004d:
            boolean r2 = r1.hasNext()
            yu0 r3 = r7.f
            if (r2 == 0) goto L_0x008d
            java.lang.Object r2 = r1.next()
            java.lang.Class r2 = (java.lang.Class) r2
            java.util.concurrent.ConcurrentHashMap r5 = r7.a
            java.lang.Object r2 = r5.get(r2)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L_0x004d
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L_0x004d
            java.util.Iterator r2 = r2.iterator()
        L_0x006f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r2.next()
            t35 r4 = (defpackage.t35) r4
            java.lang.Object r5 = r3.get()
            java.util.concurrent.ConcurrentLinkedQueue r5 = (java.util.concurrent.ConcurrentLinkedQueue) r5
            zu0 r6 = new zu0
            r6.<init>(r8, r4)
            r5.offer(r6)
            goto L_0x006f
        L_0x008a:
            r2 = 1
            r4 = r2
            goto L_0x004d
        L_0x008d:
            if (r4 != 0) goto L_0x009b
            boolean r1 = r8 instanceof defpackage.d44
            if (r1 != 0) goto L_0x009b
            d44 r1 = new d44
            r1.<init>(r0, r8)
            r7.c(r1)
        L_0x009b:
            yu0 r7 = r7.g
            java.lang.Object r8 = r7.get()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x00aa
            goto L_0x00c2
        L_0x00aa:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r7.set(r8)
        L_0x00af:
            java.lang.Object r8 = r3.get()     // Catch:{ all -> 0x00cf }
            java.util.concurrent.ConcurrentLinkedQueue r8 = (java.util.concurrent.ConcurrentLinkedQueue) r8     // Catch:{ all -> 0x00cf }
            java.lang.Object r8 = r8.poll()     // Catch:{ all -> 0x00cf }
            zu0 r8 = (defpackage.zu0) r8     // Catch:{ all -> 0x00cf }
            if (r8 != 0) goto L_0x00c3
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r7.set(r8)
        L_0x00c2:
            return
        L_0x00c3:
            t35 r0 = r8.b     // Catch:{ all -> 0x00cf }
            boolean r1 = r0.d     // Catch:{ all -> 0x00cf }
            if (r1 == 0) goto L_0x00af
            java.lang.Object r8 = r8.a     // Catch:{ all -> 0x00cf }
            a(r8, r0)     // Catch:{ all -> 0x00cf }
            goto L_0x00af
        L_0x00cf:
            r8 = move-exception
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r7.set(r0)
            throw r8
        L_0x00d6:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "Event to post must not be null."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av0.c(java.lang.Object):void");
    }

    public void d(Object obj) {
        if (obj != null) {
            this.d.b((cy7) this);
            hx9 hx9 = this.e;
            HashMap o = hx9.o(obj);
            Iterator it = o.keySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                ConcurrentHashMap concurrentHashMap = this.b;
                ConcurrentHashMap concurrentHashMap2 = this.a;
                if (hasNext) {
                    Class cls = (Class) it.next();
                    e45 e45 = (e45) o.get(cls);
                    e45 e452 = (e45) concurrentHashMap.putIfAbsent(cls, e45);
                    if (e452 == null) {
                        Set<t35> set = (Set) concurrentHashMap2.get(cls);
                        if (set != null && !set.isEmpty()) {
                            for (t35 b2 : set) {
                                b(b2, e45);
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Producer method for type " + cls + " found on type " + e45.a.getClass() + ", but already registered by type " + e452.a.getClass() + ".");
                    }
                } else {
                    HashMap p = hx9.p(obj);
                    for (Class cls2 : p.keySet()) {
                        Set set2 = (Set) concurrentHashMap2.get(cls2);
                        if (set2 == null) {
                            set2 = new CopyOnWriteArraySet();
                            Set set3 = (Set) concurrentHashMap2.putIfAbsent(cls2, set2);
                            if (set3 != null) {
                                set2 = set3;
                            }
                        }
                        if (!set2.addAll((Set) p.get(cls2))) {
                            throw new IllegalArgumentException("Object already registered.");
                        }
                    }
                    for (Map.Entry entry : p.entrySet()) {
                        e45 e453 = (e45) concurrentHashMap.get((Class) entry.getKey());
                        if (e453 != null && e453.d) {
                            for (t35 t35 : (Set) entry.getValue()) {
                                if (!e453.d) {
                                    break;
                                } else if (t35.d) {
                                    b(t35, e453);
                                }
                            }
                        }
                    }
                    return;
                }
            }
        } else {
            throw new NullPointerException("Object to register must not be null.");
        }
    }

    public void f(Object obj) {
        if (obj != null) {
            this.d.b((cy7) this);
            hx9 hx9 = this.e;
            for (Map.Entry entry : hx9.o(obj).entrySet()) {
                Class cls = (Class) entry.getKey();
                ConcurrentHashMap concurrentHashMap = this.b;
                e45 e45 = (e45) concurrentHashMap.get(cls);
                e45 e452 = (e45) entry.getValue();
                if (e452 == null || !e452.equals(e45)) {
                    throw new IllegalArgumentException("Missing event producer for an annotated method. Is " + obj.getClass() + " registered?");
                }
                ((e45) concurrentHashMap.remove(cls)).d = false;
            }
            for (Map.Entry entry2 : hx9.p(obj).entrySet()) {
                Set<t35> set = (Set) this.a.get((Class) entry2.getKey());
                Collection collection = (Collection) entry2.getValue();
                if (set == null || !set.containsAll(collection)) {
                    throw new IllegalArgumentException("Missing event handler for an annotated method. Is " + obj.getClass() + " registered?");
                }
                for (t35 t35 : set) {
                    if (collection.contains(t35)) {
                        t35.d = false;
                    }
                }
                set.removeAll(collection);
            }
            return;
        }
        throw new NullPointerException("Object to unregister must not be null.");
    }

    public final String toString() {
        return zr6.l(new StringBuilder("[Bus \""), this.c, "\"]");
    }
}
