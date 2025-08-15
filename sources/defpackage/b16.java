package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.fragment.app.strictmode.Violation;

/* renamed from: b16  reason: default package */
public final class b16 implements LayoutInflater.Factory2 {
    public final c a;

    public b16(c cVar) {
        this.a = cVar;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        e eVar;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        c cVar = this.a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, cVar);
        }
        a aVar = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m3c.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(m3c.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(m3c.Fragment_android_id, -1);
        String string = obtainStyledAttributes.getString(m3c.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            int i = 0;
            try {
                z = a.class.isAssignableFrom(f16.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (z) {
                if (view != null) {
                    i = view.getId();
                }
                if (i == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                if (resourceId != -1) {
                    aVar = cVar.D(resourceId);
                }
                if (aVar == null && string != null) {
                    aVar = cVar.E(string);
                }
                if (aVar == null && i != -1) {
                    aVar = cVar.D(i);
                }
                if (aVar == null) {
                    f16 J = cVar.J();
                    context.getClassLoader();
                    aVar = J.a(attributeValue);
                    aVar.z0 = true;
                    aVar.J0 = resourceId != 0 ? resourceId : i;
                    aVar.K0 = i;
                    aVar.L0 = string;
                    aVar.A0 = true;
                    aVar.F0 = cVar;
                    z06 z06 = cVar.w;
                    aVar.G0 = z06;
                    Context context2 = z06.u0;
                    aVar.F0(attributeSet, aVar.b);
                    eVar = cVar.a(aVar);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        aVar.toString();
                        Integer.toHexString(resourceId);
                    }
                } else if (!aVar.A0) {
                    aVar.A0 = true;
                    aVar.F0 = cVar;
                    z06 z062 = cVar.w;
                    aVar.G0 = z062;
                    Context context3 = z062.u0;
                    aVar.F0(attributeSet, aVar.b);
                    eVar = cVar.g(aVar);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        aVar.toString();
                        Integer.toHexString(resourceId);
                    }
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + attributeValue);
                }
                ViewGroup viewGroup = (ViewGroup) view;
                t16 t16 = u16.a;
                u16.b(new Violation(aVar, "Attempting to use <fragment> tag to add fragment " + aVar + " to container " + viewGroup));
                u16.a(aVar).getClass();
                aVar.T0 = viewGroup;
                eVar.k();
                eVar.j();
                View view2 = aVar.U0;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (aVar.U0.getTag() == null) {
                        aVar.U0.setTag(string);
                    }
                    aVar.U0.addOnAttachStateChangeListener(new o50(this, eVar));
                    return aVar.U0;
                }
                throw new IllegalStateException(zr6.i("Fragment ", attributeValue, " did not create a view."));
            }
        }
        return null;
    }
}
