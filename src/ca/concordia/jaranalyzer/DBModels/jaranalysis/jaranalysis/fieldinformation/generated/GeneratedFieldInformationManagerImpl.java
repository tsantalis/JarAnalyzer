package ca.concordia.jaranalyzer.DBModels.jaranalysis.jaranalysis.fieldinformation.generated;

import ca.concordia.jaranalyzer.DBModels.jaranalysis.jaranalysis.fieldinformation.FieldInformation;
import ca.concordia.jaranalyzer.DBModels.jaranalysis.jaranalysis.fieldinformation.FieldInformationManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * ca.concordia.jaranalyzer.DBModels.jaranalysis.jaranalysis.fieldinformation.FieldInformation}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedFieldInformationManagerImpl 
extends AbstractManager<FieldInformation> 
implements GeneratedFieldInformationManager {
    
    private final TableIdentifier<FieldInformation> tableIdentifier;
    
    protected GeneratedFieldInformationManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("JarAnalysis", "JarAnalysis", "FieldInformation");
    }
    
    @Override
    public TableIdentifier<FieldInformation> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<FieldInformation>> fields() {
        return FieldInformationManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<FieldInformation>> primaryKeyFields() {
        return Stream.of(
            FieldInformation.ID
        );
    }
}