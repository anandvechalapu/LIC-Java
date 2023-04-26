@Repository
public interface QuotationMemberBankDetailTempRepository extends JpaRepository<QuotationMemberBankDetail, Long> {
    void deleteById(Long bankId);
}