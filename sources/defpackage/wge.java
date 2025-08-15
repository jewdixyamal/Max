package defpackage;

/* renamed from: wge  reason: default package */
public interface wge {
    void a() {
        k56 onRequestInterceptTouchEvent = getOnRequestInterceptTouchEvent();
        if (onRequestInterceptTouchEvent != null) {
            onRequestInterceptTouchEvent.invoke();
        }
    }

    k56 getOnRequestInterceptTouchEvent();

    m56 getOnTouch();

    void setOnRequestInterceptTouchEvent(k56 k56);

    void setOnTouch(m56 m56);
}
