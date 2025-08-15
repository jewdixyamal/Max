package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import scout.exception.ElementCreationFailedException;
import scout.exception.MissingObjectFactoryException;
import scout.exception.ObjectCreationFailedException;
import scout.exception.ObjectNullabilityException;

/* renamed from: ruc  reason: default package */
public final class ruc {
    public final String a;
    public final List b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final Set f;
    public final v4 g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;
    public final int l;

    public ruc(String str, List list, Map map, Map map2, Map map3, Set set) {
        List list2;
        this.a = str;
        this.b = list;
        this.c = map;
        this.d = map2;
        this.e = map3;
        this.f = set;
        this.g = hm9.n ? new gk4(this, 0) : new gk4(this, 1);
        boolean isEmpty = list.isEmpty();
        List list3 = nz4.a;
        if (isEmpty) {
            list2 = list3;
        } else {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (int L = y53.L(list); L >= 0; L--) {
                ruc ruc = (ruc) list.get(L);
                if (hashSet.add(ruc)) {
                    arrayList.add(ruc);
                }
                for (ruc ruc2 : ruc.h) {
                    if (hashSet.add(ruc2)) {
                        arrayList.add(ruc2);
                    }
                }
            }
            list2 = Collections.unmodifiableList(arrayList);
        }
        this.h = list2;
        List<ruc> list4 = this.b;
        if (!list4.isEmpty()) {
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (ruc ruc3 : list4) {
                for (ruc ruc4 : ruc3.i) {
                    if (hashSet2.add(ruc4)) {
                        arrayList2.add(ruc4);
                    }
                }
                if (hashSet2.add(ruc3)) {
                    arrayList2.add(ruc3);
                }
            }
            list3 = Collections.unmodifiableList(arrayList2);
        }
        this.i = list3;
        List list5 = this.h;
        this.j = list5;
        this.k = list3;
        this.l = list5.size();
    }

    public static final void b(StringBuilder sb, ruc ruc, int i2) {
        sb.append(10);
        int i3 = i2 + 1;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append("   ");
        }
        sb.append("⌞ " + ruc + " (object factories: " + ruc.c.size() + ", collection factories: " + ruc.d.size() + ", association factories: " + ruc.e.size() + ", allowed object overrides: " + ruc.f.size() + ')');
        for (ruc b2 : ruc.j) {
            b(sb, b2, i3);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nTree of scopes:");
        b(sb, this, 0);
        return sb.toString();
    }

    public final ArrayList c(Class cls) {
        List list;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = this.l;
            list = nz4.a;
            if (i3 >= i4) {
                break;
            }
            ruc ruc = (ruc) this.k.get(i3);
            List list2 = (List) ruc.d.get(cls);
            if (list2 != null) {
                list = list2;
            }
            int size = list.size();
            int i5 = 0;
            while (i5 < size) {
                try {
                    arrayList.add(((b37) list.get(i5)).a(ruc.g));
                    i5++;
                } catch (Exception e2) {
                    throw new ElementCreationFailedException(cls, this, e2);
                }
            }
            i3++;
        }
        List list3 = (List) this.d.get(cls);
        if (list3 != null) {
            list = list3;
        }
        int size2 = list.size();
        while (i2 < size2) {
            try {
                arrayList.add(((b37) list.get(i2)).a(this.g));
                i2++;
            } catch (Exception e3) {
                throw new ElementCreationFailedException(cls, this, e3);
            }
        }
        arrayList.isEmpty();
        return arrayList;
    }

    public final Object d(Class cls, boolean z) {
        b37 b37 = (b37) this.c.get(cls);
        if (b37 != null) {
            try {
                Object a2 = b37.a(this.g);
                if (a2 != null || !z) {
                    return a2;
                }
                throw new ObjectNullabilityException(cls, this);
            } catch (Exception e2) {
                throw new ObjectCreationFailedException(cls, this, e2);
            }
        } else {
            int i2 = 0;
            while (i2 < this.l) {
                ruc ruc = (ruc) this.j.get(i2);
                b37 b372 = (b37) ruc.c.get(cls);
                if (b372 != null) {
                    try {
                        Object a3 = b372.a(ruc.g);
                        if (a3 != null || !z) {
                            return a3;
                        }
                        throw new ObjectNullabilityException(cls, this);
                    } catch (Exception e3) {
                        throw new ObjectCreationFailedException(cls, this, e3);
                    }
                } else {
                    i2++;
                }
            }
            if (!z) {
                return null;
            }
            throw new MissingObjectFactoryException(cls, this);
        }
    }

    public final String toString() {
        return zr6.l(new StringBuilder("Scope(name=\""), this.a, "\")");
    }
}
