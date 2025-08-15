package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: wq8  reason: default package */
public class wq8 implements Menu {
    public static final int[] J0 = {1, 4, 5, 3, 2, 0};
    public boolean A0 = false;
    public boolean B0 = false;
    public boolean C0 = false;
    public boolean D0 = false;
    public final ArrayList E0 = new ArrayList();
    public final CopyOnWriteArrayList F0 = new CopyOnWriteArrayList();
    public br8 G0;
    public boolean H0 = false;
    public boolean I0;
    public uq8 X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean o;
    public boolean s0;
    public final ArrayList t0;
    public final ArrayList u0;
    public boolean v0;
    public int w0 = 0;
    public CharSequence x0;
    public Drawable y0;
    public View z0;

    public wq8(Context context) {
        boolean z = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.Y = new ArrayList();
        this.Z = new ArrayList();
        this.s0 = true;
        this.t0 = new ArrayList();
        this.u0 = new ArrayList();
        this.v0 = true;
        if (resources.getConfiguration().keyboard != 1 && bnf.b(ViewConfiguration.get(context))) {
            z = true;
        }
        this.o = z;
    }

    public final br8 a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = (-65536 & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (J0[i5] << 16) | (65535 & i3);
        br8 br8 = new br8(this, i, i2, i3, i6, charSequence, this.w0);
        ArrayList arrayList = this.Y;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            } else if (((br8) arrayList.get(size)).o <= i6) {
                i4 = size + 1;
                break;
            } else {
                size--;
            }
        }
        arrayList.add(i4, br8);
        p(true);
        return br8;
    }

    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [android.view.MenuItem[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int addIntentOptions(int r8, int r9, int r10, android.content.ComponentName r11, android.content.Intent[] r12, android.content.Intent r13, int r14, android.view.MenuItem[] r15) {
        /*
            r7 = this;
            android.content.Context r0 = r7.a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r11 = r0.queryIntentActivityOptions(r11, r12, r13, r1)
            if (r11 == 0) goto L_0x0012
            int r2 = r11.size()
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            r14 = r14 & 1
            if (r14 != 0) goto L_0x001a
            r7.removeGroup(r8)
        L_0x001a:
            if (r1 >= r2) goto L_0x005b
            java.lang.Object r14 = r11.get(r1)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r3 = new android.content.Intent
            int r4 = r14.specificIndex
            if (r4 >= 0) goto L_0x002a
            r4 = r13
            goto L_0x002c
        L_0x002a:
            r4 = r12[r4]
        L_0x002c:
            r3.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo
            java.lang.String r6 = r6.packageName
            java.lang.String r5 = r5.name
            r4.<init>(r6, r5)
            r3.setComponent(r4)
            java.lang.CharSequence r4 = r14.loadLabel(r0)
            br8 r4 = r7.a(r8, r9, r10, r4)
            android.graphics.drawable.Drawable r5 = r14.loadIcon(r0)
            r4.setIcon((android.graphics.drawable.Drawable) r5)
            r4.Z = r3
            if (r15 == 0) goto L_0x0058
            int r14 = r14.specificIndex
            if (r14 < 0) goto L_0x0058
            r15[r14] = r4
        L_0x0058:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq8.addIntentOptions(int, int, int, android.content.ComponentName, android.content.Intent[], android.content.Intent, int, android.view.MenuItem[]):int");
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(or8 or8, Context context) {
        this.F0.add(new WeakReference(or8));
        or8.k(context, this);
        this.v0 = true;
    }

    public final void c(boolean z) {
        if (!this.D0) {
            this.D0 = true;
            CopyOnWriteArrayList copyOnWriteArrayList = this.F0;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                or8 or8 = (or8) weakReference.get();
                if (or8 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    or8.c(this, z);
                }
            }
            this.D0 = false;
        }
    }

    public final void clear() {
        br8 br8 = this.G0;
        if (br8 != null) {
            d(br8);
        }
        this.Y.clear();
        p(true);
    }

    public final void clearHeader() {
        this.y0 = null;
        this.x0 = null;
        this.z0 = null;
        p(false);
    }

    public final void close() {
        c(true);
    }

    public boolean d(br8 br8) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.F0;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty() && this.G0 == br8) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                or8 or8 = (or8) weakReference.get();
                if (or8 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z = or8.e(br8);
                    if (z) {
                        break;
                    }
                }
            }
            v();
            if (z) {
                this.G0 = null;
            }
        }
        return z;
    }

    public boolean e(wq8 wq8, MenuItem menuItem) {
        uq8 uq8 = this.X;
        return uq8 != null && uq8.z(wq8, menuItem);
    }

    public boolean f(br8 br8) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.F0;
        boolean z = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            or8 or8 = (or8) weakReference.get();
            if (or8 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z = or8.h(br8);
                if (z) {
                    break;
                }
            }
        }
        v();
        if (z) {
            this.G0 = br8;
        }
        return z;
    }

    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            br8 br8 = (br8) arrayList.get(i2);
            if (br8.a == i) {
                return br8;
            }
            if (br8.hasSubMenu() && (findItem = br8.z0.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final br8 g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.E0;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (br8) arrayList.get(0);
        }
        boolean n = n();
        for (int i2 = 0; i2 < size; i2++) {
            br8 br8 = (br8) arrayList.get(i2);
            char c2 = n ? br8.u0 : br8.s0;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (n && c2 == 8 && i == 67))) {
                return br8;
            }
        }
        return null;
    }

    public final MenuItem getItem(int i) {
        return (MenuItem) this.Y.get(i);
    }

    public final void h(List list, int i, KeyEvent keyEvent) {
        boolean n = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.Y;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                br8 br8 = (br8) arrayList.get(i2);
                if (br8.hasSubMenu()) {
                    br8.z0.h(list, i, keyEvent);
                }
                char c2 = n ? br8.u0 : br8.s0;
                if ((modifiers & 69647) == ((n ? br8.v0 : br8.t0) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (n && c2 == 8 && i == 67)) && br8.isEnabled()) {
                        list.add(br8);
                    }
                }
            }
        }
    }

    public final boolean hasVisibleItems() {
        if (this.I0) {
            return true;
        }
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((br8) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l = l();
        if (this.v0) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.F0;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                or8 or8 = (or8) weakReference.get();
                if (or8 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z |= or8.d();
                }
            }
            ArrayList arrayList = this.t0;
            ArrayList arrayList2 = this.u0;
            if (z) {
                arrayList.clear();
                arrayList2.clear();
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    br8 br8 = (br8) l.get(i);
                    if (br8.f()) {
                        arrayList.add(br8);
                    } else {
                        arrayList2.add(br8);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.v0 = false;
        }
    }

    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public wq8 k() {
        return this;
    }

    public final ArrayList l() {
        boolean z = this.s0;
        ArrayList arrayList = this.Z;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.Y;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            br8 br8 = (br8) arrayList2.get(i);
            if (br8.isVisible()) {
                arrayList.add(br8);
            }
        }
        this.s0 = false;
        this.v0 = true;
        return arrayList;
    }

    public boolean m() {
        return this.H0;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.o;
    }

    public final void p(boolean z) {
        if (!this.A0) {
            if (z) {
                this.s0 = true;
                this.v0 = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.F0;
            if (!copyOnWriteArrayList.isEmpty()) {
                w();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    or8 or8 = (or8) weakReference.get();
                    if (or8 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        or8.i();
                    }
                }
                v();
                return;
            }
            return;
        }
        this.B0 = true;
        if (z) {
            this.C0 = true;
        }
    }

    public final boolean performIdentifierAction(int i, int i2) {
        return q(findItem(i), (or8) null, i2);
    }

    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        br8 g = g(i, keyEvent);
        boolean q = g != null ? q(g, (or8) null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return q;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q(android.view.MenuItem r7, defpackage.or8 r8, int r9) {
        /*
            r6 = this;
            br8 r7 = (defpackage.br8) r7
            r0 = 0
            if (r7 == 0) goto L_0x00c4
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000d
            goto L_0x00c4
        L_0x000d:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.A0
            r2 = 1
            if (r1 == 0) goto L_0x001a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L_0x001a
        L_0x0018:
            r1 = r2
            goto L_0x0039
        L_0x001a:
            wq8 r1 = r7.y0
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L_0x0023
            goto L_0x0018
        L_0x0023:
            android.content.Intent r3 = r7.Z
            if (r3 == 0) goto L_0x002d
            android.content.Context r1 = r1.a     // Catch:{ ActivityNotFoundException -> 0x002d }
            r1.startActivity(r3)     // Catch:{ ActivityNotFoundException -> 0x002d }
            goto L_0x0018
        L_0x002d:
            k7 r1 = r7.L0
            if (r1 == 0) goto L_0x0038
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x0038
            goto L_0x0018
        L_0x0038:
            r1 = r0
        L_0x0039:
            k7 r3 = r7.L0
            if (r3 == 0) goto L_0x0045
            boolean r4 = r3.a()
            if (r4 == 0) goto L_0x0045
            r4 = r2
            goto L_0x0046
        L_0x0045:
            r4 = r0
        L_0x0046:
            boolean r5 = r7.e()
            if (r5 == 0) goto L_0x0058
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x00c3
            r6.c(r2)
            goto L_0x00c3
        L_0x0058:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x0069
            if (r4 == 0) goto L_0x0061
            goto L_0x0069
        L_0x0061:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x00c3
            r6.c(r2)
            goto L_0x00c3
        L_0x0069:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0070
            r6.c(r0)
        L_0x0070:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0084
            qae r9 = new qae
            android.content.Context r5 = r6.a
            r9.<init>(r5, r6, r7)
            r7.z0 = r9
            java.lang.CharSequence r5 = r7.X
            r9.setHeaderTitle((java.lang.CharSequence) r5)
        L_0x0084:
            qae r7 = r7.z0
            if (r4 == 0) goto L_0x008b
            r3.f(r7)
        L_0x008b:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.F0
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L_0x0094
            goto L_0x00bd
        L_0x0094:
            if (r8 == 0) goto L_0x009a
            boolean r0 = r8.b(r7)
        L_0x009a:
            java.util.Iterator r8 = r9.iterator()
        L_0x009e:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x00bd
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            or8 r4 = (defpackage.or8) r4
            if (r4 != 0) goto L_0x00b6
            r9.remove(r3)
            goto L_0x009e
        L_0x00b6:
            if (r0 != 0) goto L_0x009e
            boolean r0 = r4.b(r7)
            goto L_0x009e
        L_0x00bd:
            r1 = r1 | r0
            if (r1 != 0) goto L_0x00c3
            r6.c(r2)
        L_0x00c3:
            return r1
        L_0x00c4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq8.q(android.view.MenuItem, or8, int):boolean");
    }

    public final void r(or8 or8) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.F0;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            or8 or82 = (or8) weakReference.get();
            if (or82 == null || or82 == or8) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public final void removeGroup(int i) {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((br8) arrayList.get(i3)).b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((br8) arrayList.get(i3)).b != i) {
                    p(true);
                } else {
                    if (i3 >= 0) {
                        ArrayList arrayList2 = this.Y;
                        if (i3 < arrayList2.size()) {
                            arrayList2.remove(i3);
                        }
                    }
                    i2 = i4;
                }
            }
            p(true);
        }
    }

    public final void removeItem(int i) {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((br8) arrayList.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.Y;
            if (i2 < arrayList2.size()) {
                arrayList2.remove(i2);
                p(true);
            }
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(j());
            int size = this.Y.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((qae) item.getSubMenu()).s(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            br8 br8 = (br8) arrayList.get(i2);
            if (br8.b == i) {
                br8.I0 = (br8.I0 & -5) | (z2 ? 4 : 0);
                br8.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.H0 = z;
    }

    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            br8 br8 = (br8) arrayList.get(i2);
            if (br8.b == i) {
                br8.setEnabled(z);
            }
        }
    }

    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            br8 br8 = (br8) arrayList.get(i2);
            if (br8.b == i) {
                int i3 = br8.I0;
                int i4 = (i3 & -9) | (z ? 0 : 8);
                br8.I0 = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            p(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.c = z;
        p(false);
    }

    public final int size() {
        return this.Y.size();
    }

    public final void t(Bundle bundle) {
        int size = this.Y.size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((qae) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.z0 = view;
            this.x0 = null;
            this.y0 = null;
        } else {
            if (i > 0) {
                this.x0 = this.b.getText(i);
            } else if (charSequence != null) {
                this.x0 = charSequence;
            }
            if (i2 > 0) {
                this.y0 = kt3.b(this.a, i2);
            } else if (drawable != null) {
                this.y0 = drawable;
            }
            this.z0 = null;
        }
        p(false);
    }

    public final void v() {
        this.A0 = false;
        if (this.B0) {
            this.B0 = false;
            p(this.C0);
        }
    }

    public final void w() {
        if (!this.A0) {
            this.A0 = true;
            this.B0 = false;
            this.C0 = false;
        }
    }

    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.b.getString(i));
    }

    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        br8 a2 = a(i, i2, i3, charSequence);
        qae qae = new qae(this.a, this, a2);
        a2.z0 = qae;
        qae.setHeaderTitle(a2.X);
        return qae;
    }

    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.b.getString(i4));
    }
}
