package https.github.com.Keven.Dev7625.Patri.git.Patrimonio.repository;


import https.github.com.Keven.Dev7625.Patri.git.Patrimonio.model.Patrimonio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
/*
public class PatrimonioRepository {
}
*/


public interface PatrimonioRepository  extends JpaRepository<Patrimonio, Long> {
}