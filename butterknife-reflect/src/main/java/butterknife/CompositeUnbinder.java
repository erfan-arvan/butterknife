package butterknife;
import javax.annotation.Nullable;  private @Nullable List<Unbinder> unbinders;

  CompositeUnbinder(@NonNull List<Unbinder> unbinders) {
    this.unbinders = unbinders;
  }

  @Override public void unbind() {
    if (unbinders == null) {
      throw new IllegalStateException("Bindings already cleared.");
    }
    for (Unbinder unbinder : unbinders) {
      unbinder.unbind();
    }
    unbinders = null;
  }
}
