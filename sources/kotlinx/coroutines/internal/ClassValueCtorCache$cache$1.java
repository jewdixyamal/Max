package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002j\u0002`\u00040\u0001J/\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002j\u0002`\u00042\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"kotlinx/coroutines/internal/ClassValueCtorCache$cache$1", "Ljava/lang/ClassValue;", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/Ctor;", "Ljava/lang/Class;", "type", "computeValue", "(Ljava/lang/Class;)Lm56;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
public final class ClassValueCtorCache$cache$1 extends ClassValue<m56> {
    public m56 computeValue(Class<?> cls) {
        return ExceptionsConstructorKt.createConstructor(cls);
    }
}
