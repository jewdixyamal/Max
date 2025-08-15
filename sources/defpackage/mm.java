package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: mm  reason: default package */
public final class mm {
    public Parcelable a;
    public Object b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Object f;

    public /* synthetic */ mm(TextView textView) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = false;
        this.f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f;
        Drawable a2 = gd3.a(compoundButton);
        if (a2 == null) {
            return;
        }
        if (this.c || this.d) {
            Drawable mutate = a2.mutate();
            if (this.c) {
                aq4.h(mutate, (ColorStateList) this.a);
            }
            if (this.d) {
                aq4.i(mutate, (PorterDuff.Mode) this.b);
            }
            if (mutate.isStateful()) {
                mutate.setState(compoundButton.getDrawableState());
            }
            compoundButton.setButtonDrawable(mutate);
        }
    }

    public void b() {
        CheckedTextView checkedTextView = (CheckedTextView) this.f;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable == null) {
            return;
        }
        if (this.c || this.d) {
            Drawable mutate = checkMarkDrawable.mutate();
            if (this.c) {
                aq4.h(mutate, (ColorStateList) this.a);
            }
            if (this.d) {
                aq4.i(mutate, (PorterDuff.Mode) this.b);
            }
            if (mutate.isStateful()) {
                mutate.setState(checkedTextView.getDrawableState());
            }
            checkedTextView.setCheckMarkDrawable(mutate);
        }
    }

    public Bundle c(String str) {
        if (this.d) {
            Bundle bundle = (Bundle) this.a;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = (Bundle) this.a;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = (Bundle) this.a;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.a = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public hsc d() {
        Map.Entry entry;
        hsc hsc;
        Iterator it = ((rqc) this.f).iterator();
        do {
            nqc nqc = (nqc) it;
            if (!nqc.hasNext()) {
                return null;
            }
            entry = (Map.Entry) nqc.next();
            hsc = (hsc) entry.getValue();
        } while (!tpa.f((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return hsc;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(2:6|7)|9|10|(1:14)|15|(1:17)|18|(1:20)|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(android.util.AttributeSet r12, int r13) {
        /*
            r11 = this;
            java.lang.Object r11 = r11.f
            r0 = r11
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            android.content.Context r1 = r0.getContext()
            int[] r2 = defpackage.p3c.CompoundButton
            r3 = 0
            k8g r1 = defpackage.k8g.x(r1, r12, r2, r13, r3)
            java.lang.Object r2 = r1.b
            android.content.res.TypedArray r2 = (android.content.res.TypedArray) r2
            r4 = r11
            android.widget.CompoundButton r4 = (android.widget.CompoundButton) r4
            android.content.Context r5 = r4.getContext()
            int[] r6 = defpackage.p3c.CompoundButton
            java.util.WeakHashMap r11 = defpackage.zmf.a
            java.lang.Object r11 = r1.b
            r8 = r11
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            r10 = 0
            r7 = r12
            r9 = r13
            defpackage.umf.d(r4, r5, r6, r7, r8, r9, r10)
            int r11 = defpackage.p3c.CompoundButton_buttonCompat     // Catch:{ all -> 0x0046 }
            boolean r11 = r2.hasValue(r11)     // Catch:{ all -> 0x0046 }
            if (r11 == 0) goto L_0x0048
            int r11 = defpackage.p3c.CompoundButton_buttonCompat     // Catch:{ all -> 0x0046 }
            int r11 = r2.getResourceId(r11, r3)     // Catch:{ all -> 0x0046 }
            if (r11 == 0) goto L_0x0048
            android.content.Context r12 = r0.getContext()     // Catch:{ NotFoundException -> 0x0048 }
            android.graphics.drawable.Drawable r11 = defpackage.s36.n(r12, r11)     // Catch:{ NotFoundException -> 0x0048 }
            r0.setButtonDrawable(r11)     // Catch:{ NotFoundException -> 0x0048 }
            goto L_0x0063
        L_0x0046:
            r11 = move-exception
            goto L_0x008f
        L_0x0048:
            int r11 = defpackage.p3c.CompoundButton_android_button     // Catch:{ all -> 0x0046 }
            boolean r11 = r2.hasValue(r11)     // Catch:{ all -> 0x0046 }
            if (r11 == 0) goto L_0x0063
            int r11 = defpackage.p3c.CompoundButton_android_button     // Catch:{ all -> 0x0046 }
            int r11 = r2.getResourceId(r11, r3)     // Catch:{ all -> 0x0046 }
            if (r11 == 0) goto L_0x0063
            android.content.Context r12 = r0.getContext()     // Catch:{ all -> 0x0046 }
            android.graphics.drawable.Drawable r11 = defpackage.s36.n(r12, r11)     // Catch:{ all -> 0x0046 }
            r0.setButtonDrawable(r11)     // Catch:{ all -> 0x0046 }
        L_0x0063:
            int r11 = defpackage.p3c.CompoundButton_buttonTint     // Catch:{ all -> 0x0046 }
            boolean r11 = r2.hasValue(r11)     // Catch:{ all -> 0x0046 }
            if (r11 == 0) goto L_0x0074
            int r11 = defpackage.p3c.CompoundButton_buttonTint     // Catch:{ all -> 0x0046 }
            android.content.res.ColorStateList r11 = r1.l(r11)     // Catch:{ all -> 0x0046 }
            defpackage.fd3.c(r0, r11)     // Catch:{ all -> 0x0046 }
        L_0x0074:
            int r11 = defpackage.p3c.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0046 }
            boolean r11 = r2.hasValue(r11)     // Catch:{ all -> 0x0046 }
            if (r11 == 0) goto L_0x008b
            int r11 = defpackage.p3c.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0046 }
            r12 = -1
            int r11 = r2.getInt(r11, r12)     // Catch:{ all -> 0x0046 }
            r12 = 0
            android.graphics.PorterDuff$Mode r11 = defpackage.hq4.c(r11, r12)     // Catch:{ all -> 0x0046 }
            defpackage.fd3.d(r0, r11)     // Catch:{ all -> 0x0046 }
        L_0x008b:
            r1.z()
            return
        L_0x008f:
            r1.z()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mm.e(android.util.AttributeSet, int):void");
    }

    public void f(String str, hsc hsc) {
        if (((hsc) ((rqc) this.f).b(str, hsc)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public void g() {
        Class<nf7> cls = nf7.class;
        if (this.e) {
            gm gmVar = (gm) this.b;
            if (gmVar == null) {
                gmVar = new gm(this);
            }
            this.b = gmVar;
            try {
                cls.getDeclaredConstructor((Class[]) null);
                gm gmVar2 = (gm) this.b;
                if (gmVar2 != null) {
                    ((LinkedHashSet) gmVar2.b).add(cls.getName());
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
    }

    public mm() {
        this.f = new rqc();
        this.e = true;
    }
}
