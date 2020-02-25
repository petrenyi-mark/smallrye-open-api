package io.smallrye.openapi.tck.extra.extensions.model;

import org.eclipse.microprofile.openapi.annotations.extensions.Extension;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

/**
 * @author mark.petrenyi
 */
@Schema(name = "ExtensionModel", description = "ExtensionModel description")
@Extension(name = "x-type-extension", value = "Type extension value.")
public class ExtensionModel {

    @Extension(name = "x-propertyExtension", value = "Property extension value.")
    @Schema(name = "extendedProperty", title = "extendedProperty", description = "extendedProperty description")
    private String extendedProperty;

    public String getExtendedProperty() {
        return extendedProperty;
    }

    public void setExtendedProperty(String extendedProperty) {
        this.extendedProperty = extendedProperty;
    }

    public ExtensionModel withProperty(String property) {
        this.extendedProperty = property;
        return this;
    }
}
