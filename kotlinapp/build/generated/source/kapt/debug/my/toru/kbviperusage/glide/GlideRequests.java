package my.toru.kbviperusage.glide;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.request.RequestOptions;
import java.io.File;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.SuppressWarnings;

/**
 * Includes all additions from methods in {@link com.bumptech.glide.annotation.GlideExtension}s
 * annotated with {@link com.bumptech.glide.annotation.GlideType}
 *
 * <p>Generated code, do not modify
 */
@SuppressWarnings("deprecation")
public class GlideRequests extends RequestManager {
  public GlideRequests(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode treeNode) {
    super(glide, lifecycle, treeNode);
  }

  @Override
  public <ResourceType> GlideRequest<ResourceType> as(Class<ResourceType> resourceClass) {
    return new GlideRequest<>(glide, this, resourceClass);
  }

  @Override
  public GlideRequest<Bitmap> asBitmap() {
    return (GlideRequest<Bitmap>) super.asBitmap();
  }

  @Override
  public GlideRequest<GifDrawable> asGif() {
    return (GlideRequest<GifDrawable>) super.asGif();
  }

  @Override
  public GlideRequest<Drawable> asDrawable() {
    return (GlideRequest<Drawable>) super.asDrawable();
  }

  @Override
  public GlideRequest<Drawable> load(Object arg0) {
    return (GlideRequest<Drawable>) super.load(arg0);
  }

  @Override
  public GlideRequest<File> downloadOnly() {
    return (GlideRequest<File>) super.downloadOnly();
  }

  @Override
  public GlideRequest<File> download(Object arg0) {
    return (GlideRequest<File>) super.download(arg0);
  }

  @Override
  public GlideRequest<File> asFile() {
    return (GlideRequest<File>) super.asFile();
  }

  @Override
  protected void setRequestOptions(@NonNull RequestOptions toSet) {
    if (toSet instanceof my.toru.kbviperusage.glide.GlideOptions) {
      super.setRequestOptions(toSet);
    } else {
      super.setRequestOptions(new my.toru.kbviperusage.glide.GlideOptions().apply(toSet));
    }
  }
}
